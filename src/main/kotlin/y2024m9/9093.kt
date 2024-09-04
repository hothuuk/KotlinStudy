package y2024m9

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        val arr = readln().split(" ")
        sb.append(arr.joinToString(" ") { it.reversed() }).append("\n")
    }

    print(sb)
}