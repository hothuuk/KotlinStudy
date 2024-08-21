package y2024m8

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val str = readln().replace(" ", "")
        val sum = str.sumOf { it.code - 64 }

        println(if (sum == 100) "PERFECT LIFE" else sum)
    }
}