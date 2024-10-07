package y2024m10

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()

    for (i in n downTo 1) {
        sb.append(i).append("\n")
    }

    print(sb)
}