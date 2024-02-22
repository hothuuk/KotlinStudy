package y2024m2.week4

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val n = readln().toInt()

        if (n <= 5) {
            sb.append(n).append("\n")
        } else {
            var m = 1 + (n / 2) + (n / 3)

            for (i in 1 .. n / 3) {
                m += (n - (3 * i)) / 2
            }

            sb.append(m).append("\n")
        }
    }

    print(sb)
}