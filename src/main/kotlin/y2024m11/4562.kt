package y2024m11

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        sb.append(if (a >= b) "MMM BRAINS" else "NO BRAINS").append("\n")
    }

    print(sb)
}
