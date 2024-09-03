package y2024m9

fun main() {
    val n = readln().toInt()
    val scores = readln().split(" ").map { it.toInt() }
    print(scores.max() - scores.min())
}