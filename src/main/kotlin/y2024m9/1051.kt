package y2024m9

import kotlin.math.max

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln().map { it - '0' }.toTypedArray() }

    var max = 1

    for (y in 0 until n) {
        for (x in 0 until m) {
            val cur = map[y][x]
            var size = 1

            while (x + size < m && y + size < n) {
                if (map[y + size][x] == cur && map[y][x + size] == cur && map[y + size][x + size] == cur) {
                    max = max(max, (size + 1) * (size + 1))
                }
                size++
            }
        }
    }

    print(max)
}