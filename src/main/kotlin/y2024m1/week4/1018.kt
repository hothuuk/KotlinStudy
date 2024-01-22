package y2024m1.week4

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = mutableListOf<String>()

    repeat(n) {
        board.add(readln())
    }

    val answer = mutableListOf<Int>()

    fun check(x: Int, y: Int, block: List<Char>): Int {
        var cnt = 0

        for (i in 0 until 8) {
            for (j in 0 until 8) {
                val ch = board[i + x][j + y]

                if ((i % 2 == 0 && j % 2 == 0 && ch == block[0]) ||
                    (i % 2 == 0 && j % 2 != 0 && ch == block[1]) ||
                    (i % 2 != 0 && j % 2 == 0 && ch == block[1]) ||
                    (i % 2 != 0 && j % 2 != 0 && ch == block[0])
                ) {
                    continue
                }
                cnt++
            }
        }

        return cnt
    }

    for (i in 0 until n - 7) {
        for (j in 0 until m - 7) {
            answer.add(check(i, j, listOf('W', 'B')))
            answer.add(check(i, j, listOf('B', 'W')))
        }
    }

    print(answer.minOrNull())
}