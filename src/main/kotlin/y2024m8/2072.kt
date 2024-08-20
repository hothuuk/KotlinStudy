package y2024m8

fun main() {
    val checkerboard = Array(20) { Array(20) { -1 } }
    val n = readln().toInt()

    repeat(n) { turn ->
        val (y, x) = readln().split(" ").map { it.toInt() }
        checkerboard[y][x] = turn % 2

        if (check(checkerboard, x, y)) {
            print(turn + 1)
            return
        }
    }

    print(-1)
}

private fun check(checkerboard: Array<Array<Int>>, x: Int, y: Int): Boolean {
    val current = checkerboard[y][x]
    val directions = arrayOf(
        Pair(-1, 0), Pair(1, 0), // 좌우
        Pair(0, -1), Pair(0, 1), // 상하
        Pair(-1, -1), Pair(1, 1), // 오른쪽 아래 대각선
        Pair(-1, 1), Pair(1, -1) // 왼쪽 아래 대각선
    )

    for (d in 0 .. 3) {
        var cnt = 1

        for (i in 0 .. 1) {
            val (dx, dy) = directions[2 * d + i]

            for (j in 1 .. 4) {
                val nx = x + j * dx
                val ny = y + j * dy

                if (nx in 1 .. 19 && ny in 1 .. 19 && current == checkerboard[ny][nx]) {
                    cnt++
                } else {
                    break
                }
            }
        }

        if (cnt == 5) return true
    }

    return false
}