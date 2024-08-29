package y2024m8

private data class Rotate(val index: Int, val x: Int, val y: Int)

private val original = arrayOf(
    arrayOf( // 위
        arrayOf('w', 'w', 'w'),
        arrayOf('w', 'w', 'w'),
        arrayOf('w', 'w', 'w')
    ),
    arrayOf( // 앞
        arrayOf('r', 'r', 'r'),
        arrayOf('r', 'r', 'r'),
        arrayOf('r', 'r', 'r')
    ),
    arrayOf( // 오
        arrayOf('b', 'b', 'b'),
        arrayOf('b', 'b', 'b'),
        arrayOf('b', 'b', 'b')
    ),
    arrayOf( // 뒤
        arrayOf('o', 'o', 'o'),
        arrayOf('o', 'o', 'o'),
        arrayOf('o', 'o', 'o')
    ),
    arrayOf( // 왼
        arrayOf('g', 'g', 'g'),
        arrayOf('g', 'g', 'g'),
        arrayOf('g', 'g', 'g')
    ),
    arrayOf( // 아
        arrayOf('y', 'y', 'y'),
        arrayOf('y', 'y', 'y'),
        arrayOf('y', 'y', 'y')
    )
)

private val rotateState = arrayOf(
    arrayOf( // 위
        arrayOf(Rotate(3, 0, 1), Rotate(2, 0, 1), Rotate(1, 0, 1), Rotate(4, 0, 1)),
        arrayOf(Rotate(3, 0, 1), Rotate(4, 0, 1), Rotate(1, 0, 1), Rotate(2, 0, 1))
    ),
    arrayOf( // 앞
        arrayOf(Rotate(0, 0, 3), Rotate(2, 1, 0), Rotate(5, 0, 1), Rotate(4, 3, 0)),
        arrayOf(Rotate(0, 0, 3), Rotate(4, 3, 0), Rotate(5, 0, 1), Rotate(2, 1, 0))
    ),
    arrayOf( // 오
        arrayOf(Rotate(0, 3, 0), Rotate(3, 1, 0), Rotate(5, 3, 0), Rotate(1, 3, 0)),
        arrayOf(Rotate(0, 3, 0), Rotate(1, 3, 0), Rotate(5, 3, 0), Rotate(3, 1, 0))
    ),
    arrayOf( // 뒤
        arrayOf(Rotate(0, 0, 1), Rotate(4, 1, 0), Rotate(5, 0, 3), Rotate(2, 3, 0)),
        arrayOf(Rotate(0, 0, 1), Rotate(2, 3, 0), Rotate(5, 0, 3), Rotate(4, 1, 0))
    ),
    arrayOf( // 왼
        arrayOf(Rotate(0, 1, 0), Rotate(1, 1, 0), Rotate(5, 1, 0), Rotate(3, 3, 0)),
        arrayOf(Rotate(0, 1, 0), Rotate(3, 3, 0), Rotate(5, 1, 0), Rotate(1, 1, 0))
    ),
    arrayOf( // 아
        arrayOf(Rotate(1, 0, 3), Rotate(2, 0, 3), Rotate(3, 0, 3), Rotate(4, 0, 3)),
        arrayOf(Rotate(1, 0, 3), Rotate(4, 0, 3), Rotate(3, 0, 3), Rotate(2, 0, 3))
    )
)

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val turns = readln().split(" ")
        val cube = copy()

        for (turn in turns) {
            val face = turn[0]
            val dir = turn[1]
            rotateFace(cube, face, dir)
        }

        cube[0].map { println(it.joinToString("")) }
    }
}

private fun copy(): Array<Array<Array<Char>>> {
    return Array(original.size) { i ->
        Array(original[i].size) { j ->
            original[i][j].copyOf()
        }
    }
}

private fun rotateFace(cube: Array<Array<Array<Char>>>, face: Char, dir: Char) {
    when (face) {
        'U' -> rotate(cube, 0, dir)
        'F' -> rotate(cube, 1, dir)
        'R' -> rotate(cube, 2, dir)
        'B' -> rotate(cube, 3, dir)
        'L' -> rotate(cube, 4, dir)
        'D' -> rotate(cube, 5, dir)
    }
}

private fun rotate(cube: Array<Array<Array<Char>>>, index: Int, dir: Char) {
    val rotateDir = if (dir == '+') 0 else 1

    val side = cube[index]
    val size = side.size
    val rotated = Array(size) { Array(size) { ' ' } }

    for (i in 0 until size) {
        for (j in 0 until size) {
            if (rotateDir == 0) {
                rotated[j][size - 1 - i] = side[i][j]
            } else {
                rotated[size - 1 - j][i] = side[i][j]
            }
        }
    }

    cube[index] = rotated

    val ros = rotateState[index][rotateDir]
    var temp = extract(cube[ros[0].index], ros[0])

    for (i in 0 until 4) {
        val nextR = ros[(i + 1) % 4]
        val nextLine = extract(cube[nextR.index], nextR)
        val reverse = (
                (index == 1 && rotateDir == 0 && (nextR.index == 0 || nextR.index == 5)) ||
                (index == 1 && rotateDir == 1 && (nextR.index == 2 || nextR.index == 4)) ||

                (index == 2 && rotateDir == 0 && (nextR.index == 3 || nextR.index == 5)) ||
                (index == 2 && rotateDir == 1 && (nextR.index == 0 || nextR.index == 3)) ||

                (index == 3 && rotateDir == 0 && (nextR.index == 2 || nextR.index == 4)) ||
                (index == 3 && rotateDir == 1 && (nextR.index == 0 || nextR.index == 5)) ||

                (index == 4 && rotateDir == 0 && (nextR.index == 0 || nextR.index == 3)) ||
                (index == 4 && rotateDir == 1 && (nextR.index == 3 || nextR.index == 5))
                )

        change(cube[nextR.index], nextR, temp, reverse)

        temp = nextLine
    }
}

private fun extract(side: Array<Array<Char>>, rotate: Rotate): Array<Char> {
    val line = Array(3) { ' ' }
    val x = rotate.x
    val y = rotate.y

    for (i in 0 until 3) {
        line[i] = if (x == 0) {
            side[y - 1][i]
        } else {
            side[i][x - 1]
        }
    }

    return line
}

private fun change(side: Array<Array<Char>>, rotate: Rotate, line: Array<Char>, reverse: Boolean) {
    val x = rotate.x
    val y = rotate.y

    val modifiedLine = if (reverse) line.reversedArray() else line

    for (i in 0 until 3) {
        if (x == 0) {
            side[y - 1][i] = modifiedLine[i]
        } else {
            side[i][x - 1] = modifiedLine[i]
        }
    }
}