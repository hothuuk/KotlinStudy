package y2024m12

fun main() {
    val (n, _) = readln().split(" ").map { it.toInt() }
    print(Array(n) { readln() }.joinToString("\n") { it.reversed() })
}