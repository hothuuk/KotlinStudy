package y2024m9

fun main() {
    val sb = StringBuilder()

    while (true) {
        val input = readlnOrNull() ?: break
        if (input.isEmpty()) break
        sb.append(input).append("\n")
    }

    print(sb)
}