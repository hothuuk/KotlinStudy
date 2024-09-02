package y2024m9

import kotlin.math.max

private val directions = arrayOf(
    Pair(1, 0), // 오른
    Pair(-1, 0), // 왼
    Pair(0, -1), // 위
    Pair(0, 1) // 아래
)

private var size = 0

fun main() {
    size = readln().toInt()
    val map = Array(size) { readln().split(" ").map { it.toInt() }.toTypedArray() }

    var max = 0

    fun move(current: Array<Array<Int>>, n: Int) {
        if (n == 5) {
            max = max(max, current.flatten().max())
            return
        }

        for (i in 0 until 4) {
            val newMap = current.deepCopy()
            moveBlock(newMap, i)
            move(newMap, n + 1)
        }
    }

    move(map, 0)

    print(max)
}

private fun moveBlock(map: Array<Array<Int>>, dir: Int) {
    val (dx, dy) = directions[dir]

    val rangeX = if (dx == 1) (size - 1 downTo 0) else (0 until size)
    val rangeY = if (dy == 1) (size - 1 downTo 0) else (0 until size)

    val merged = Array(size) { BooleanArray(size) }

    for (i in rangeY) {
        for (j in rangeX) {
            val block = map[i][j]
            if (block == 0) continue

            var (nx, ny) = j to i

            while (true) {
                val nextX = nx + dx
                val nextY = ny + dy

                if (nextX !in 0 until size || nextY !in 0 until size) break

                val nextBlock = map[nextY][nextX]

                if (nextBlock == 0) {
                    map[ny][nx] = 0
                    nx = nextX
                    ny = nextY
                    map[ny][nx] = block
                } else if (nextBlock == block && !merged[nextY][nextX]) {
                    map[ny][nx] = 0
                    map[nextY][nextX] = block * 2
                    merged[nextY][nextX] = true
                    break
                } else {
                    break
                }
            }
        }
    }
}

private fun Array<Array<Int>>.deepCopy(): Array<Array<Int>> {
    return Array(size) { this[it].copyOf() }
}
