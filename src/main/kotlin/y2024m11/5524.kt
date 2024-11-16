package y2024m11

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        sb.append(readln().lowercase()).append("\n")
    }

    print(sb)
}