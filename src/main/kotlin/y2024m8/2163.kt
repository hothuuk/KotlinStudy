package y2024m8

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    print((n * m) - 1)
}