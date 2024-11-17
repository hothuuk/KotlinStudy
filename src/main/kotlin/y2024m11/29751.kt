package y2024m11

fun main() {
    val (w, h) = readln().split(" ").map { it.toDouble() }
    print(String.format("%.1f", (w * h) / 2))
}