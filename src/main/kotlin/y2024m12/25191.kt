package y2024m12

fun main() {
    val n = readln().toInt()
    val (a, b) = readln().split(" ").map { it.toInt() }
    print(minOf(n, (a / 2) + b))
}