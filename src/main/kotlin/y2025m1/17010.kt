package y2025m1

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        val (l, c) = readln().split(" ")
        sb.append(c.repeat(l.toInt())).append("\n")
    }

    print(sb)
}