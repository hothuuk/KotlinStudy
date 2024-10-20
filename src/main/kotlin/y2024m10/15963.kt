package y2024m10

fun main() {
    val (n, m) = readln().split(" ").map { it.toLong() }
    print(if (n == m) 1 else 0)
}