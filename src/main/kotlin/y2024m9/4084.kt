package y2024m9

import kotlin.math.abs

fun main() {
    val sb = StringBuilder()

    while (true) {
        val (a, b, c, d) = readln().split(" ").map { it.toInt() }

        if (a == 0) break

        sb.append(convergence(a, b, c, d)).append("\n")
    }

    print(sb)
}

private fun convergence(a: Int, b: Int, c: Int, d: Int): Int {
    if (a == b && a == c && a == d) return 0
    return convergence(abs(a - b), abs(b - c), abs(c - d), abs(d - a)) + 1
}