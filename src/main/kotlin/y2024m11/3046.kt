package y2024m11

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    print(b * 2 - a)
}