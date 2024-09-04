package y2024m9

private val matches = listOf(
    Triple(1 to 1, 1 to 2, 1 to 3),
    Triple(1 to 1, 2 to 1, 3 to 1),
    Triple(1 to 1, 2 to 2, 3 to 3),
    Triple(1 to 2, 2 to 2, 3 to 2),
    Triple(1 to 3, 2 to 3, 3 to 3),
    Triple(1 to 3, 2 to 2, 3 to 1),
    Triple(2 to 1, 2 to 2, 2 to 3),
    Triple(3 to 1, 3 to 2, 3 to 3)
)

fun main() {
    val first = readln().toInt()
    val ttt = Array(4) { Array(4) { 0 } }

    for (i in 1 .. 9) {
        val (y, x) = readln().split(" ").map { it.toInt() }
        ttt[y][x] = if (i % 2 == 0) 3 - first else first

        for ((a, b, c) in matches) {
            if (ttt[a.first][a.second] * ttt[b.first][b.second] * ttt[c.first][c.second] == 0) continue

            if (ttt[a.first][a.second] == ttt[b.first][b.second] && ttt[a.first][a.second] == ttt[c.first][c.second]) {
                print(ttt[a.first][a.second])
                return
            }
        }
    }

    print(0)
}