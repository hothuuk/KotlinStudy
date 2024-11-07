package y2024m11

fun main() {
    val n = readln().toInt()
    val input = Array(n) { readln() }
    val sb = StringBuilder()

    for (i in 1 .. n) {
        sb.append("$i. ${input[i - 1]}\n")
    }

    print(sb)
}