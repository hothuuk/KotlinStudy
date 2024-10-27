package y2024m10

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    print((b / a) * 3 * c)
}