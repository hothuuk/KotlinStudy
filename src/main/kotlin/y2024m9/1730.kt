package y2024m9

private val dir = mapOf(
    Pair('U', Pair(0, -1)),
    Pair('D', Pair(0, 1)),
    Pair('L', Pair(-1, 0)),
    Pair('R', Pair(1, 0))
)

fun main() {
    val n = readln().toInt()
    val moves = readln()
    val map = Array(n) { Array(n) { '.' } }

    var (x, y) = Pair(0, 0)

    for (move in moves) {
        val (dx, dy) = dir.getOrDefault(move, Pair(0, 0))
        val nx = x + dx
        val ny = y + dy

        if (nx in 0 until n && ny in 0 until n) {
            moving(map, move, x, y)
            moving(map, move, nx, ny)

            x = nx
            y = ny
        }
    }

    map.map { println(it.joinToString("")) }
}

private fun moving(map: Array<Array<Char>>, m: Char, x: Int, y: Int) {
    when(m) {
        'U', 'D' -> {
            if (map[y][x] == '.') map[y][x] = '|'
            else if (map[y][x] == '-') map[y][x] = '+'
        }
        'L', 'R' -> {
            if (map[y][x] == '.') map[y][x] = '-'
            else if (map[y][x] == '|') map[y][x] = '+'
        }
    }
}