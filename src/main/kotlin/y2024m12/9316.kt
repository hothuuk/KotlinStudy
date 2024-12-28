package y2024m12

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 1 .. n) {
        sb.append("Hello World, Judge $i!\n")
    }

    print(sb)
}