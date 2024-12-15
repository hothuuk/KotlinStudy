package y2024m12

fun main() {
    val sb = StringBuilder()

    while (true) {
        val sum = readln().split(" ").sumOf { it.toInt() }

        if (sum == 0) break

        sb.append(sum).append("\n")
    }

    print(sb)
}