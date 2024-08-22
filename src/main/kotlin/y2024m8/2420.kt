package y2024m8

import kotlin.math.abs

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    print(abs(a - b))
}