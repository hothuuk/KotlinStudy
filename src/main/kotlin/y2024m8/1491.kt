package y2024m8

private val directions = arrayOf(
    Pair(1, 0), // 오
    Pair(0, 1), // 아래
    Pair(-1, 0), // 왼
    Pair(0, -1) // 위
)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(m) { BooleanArray(n) }

    var x = 0
    var y = 0
    var dir = 0
    var cnt = 1
    val max = n * m

    while (cnt < max) {
        map[y][x] = true

        val (dx, dy) = directions[dir]
        val nx = x + dx
        val ny = y + dy

        if (nx !in 0 until n || ny !in 0 until m || map[ny][nx]) {
            dir = (dir + 1) % 4
        } else {
            x = nx
            y = ny
            cnt++
        }
    }

    print("$x $y")
}