package y2024m10

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        val (s, n) = readln().split(" ").map { it.toInt() }
        val ants = Array(n) { readln().toInt() }.map { if (it > s / 2) s - it else it }
        sb.append("${ants.max()} ${s - ants.min()}\n")
    }

    print(sb)
}