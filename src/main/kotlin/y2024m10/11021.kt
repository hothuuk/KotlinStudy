package y2024m10

fun main() {
    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println("Case #${it + 1}: ${a + b}")
    }
}