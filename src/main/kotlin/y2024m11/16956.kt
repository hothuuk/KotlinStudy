package y2024m11

private val dir = arrayOf(
    1 to 0,
    -1 to 0,
    0 to 1,
    0 to -1
)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln() }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 'W') {
                for ((dx, dy) in dir) {
                    val nx = j + dx
                    val ny = i + dy

                    if (nx in 0 until m && ny in 0 until n) {
                        if (map[ny][nx] == 'S') {
                            print(0)
                            return
                        }
                    }
                }
            }
        }
    }

    val ans = Array(n) { Array(m) { ' ' } }

    for (i in 0 until n) {
        for (j in 0 until m) {
            ans[i][j] = if (map[i][j] == '.') 'D' else map[i][j]
        }
    }

    println(1)
    ans.map { println(it.joinToString("")) }
}