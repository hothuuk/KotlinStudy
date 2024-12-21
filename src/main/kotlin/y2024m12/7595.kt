package y2024m12

fun main() {
    val sb = StringBuilder()

    while (true) {
        val n = readln().toInt()

        if (n == 0) break

        for (i in 0 until n) {
            for (j in 0 .. i) {
                sb.append("*")
            }

            sb.append("\n")
        }
    }

    print(sb)
}