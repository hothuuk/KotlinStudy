package y2024m12

fun main() {
    val (a, b) = readln().split(" ").map { it.toDouble() }
    print(if (a - (b * 0.01 * a) < 100) 1 else 0)
}