package y2024m10

fun main() {
    val scores = Array(5) { maxOf(40, readln().toInt()) }
    print(scores.sum() / 5)
}