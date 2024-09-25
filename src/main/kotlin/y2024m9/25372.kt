package y2024m9

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    repeat(n) {
        sb.append(if (readln().length in 6 .. 9) "yes" else "no").append("\n")
    }

    print(sb)
}