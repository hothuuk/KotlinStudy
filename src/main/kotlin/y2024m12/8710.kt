package y2024m12

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    val d = b - a
    print(if (d % c == 0) d / c else d / c + 1)
}