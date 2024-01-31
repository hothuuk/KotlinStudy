package y2024m1.week5

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine().split("-")
    var min = str[0].split("+").sumOf { it.toInt() }

    for (i in 1 until str.size) {
        min -= str[i].split("+").sumOf { it.toInt() }
    }

    println(min)
}