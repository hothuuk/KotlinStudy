package y2024m11

fun main() {
    val (k, n, m) = readln().split(" ").map { it.toInt() }
    print(maxOf(0, (k * n) - m))
}