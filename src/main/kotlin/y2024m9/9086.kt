package y2024m9

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        val input = readln()
        sb.append(input.first()).append(input.last()).append("\n")
    }

    print(sb)
}