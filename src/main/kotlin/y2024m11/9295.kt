package y2024m11

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) { i ->
        sb.append("Case ${i + 1}: ${readln().split(" ").sumOf { it.toInt() }}\n")
    }

    print(sb)
}