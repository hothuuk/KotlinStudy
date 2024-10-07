package y2024m10

fun main() {
    val sb = StringBuilder()

    while (true) {
        val (n, a, w) = readln().split(" ")

        if (n == "#") break

        if (a.toInt() > 17 || w.toInt() >= 80) {
            sb.append("$n Senior\n")
        } else {
            sb.append("$n Junior\n")
        }
    }

    print(sb)
}