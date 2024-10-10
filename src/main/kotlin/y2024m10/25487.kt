package y2024m10

fun main() {
    val t = readln().toInt()
    val input = Array(t) { readln().split(" ").map { it.toInt() } }
    val sb = StringBuilder()

    input.map { sb.append(it.min()).append("\n") }
    print(sb)
}