package y2024m9

fun main() {
    val sb = StringBuilder()

    while (true) {
        val n = readln().toInt()

        if (n == 0) {
            print(sb)
            return
        }

        var sum = 0

        for (i in 1 .. n) {
            sum += i
        }

        sb.append(sum).append("\n")
    }
}