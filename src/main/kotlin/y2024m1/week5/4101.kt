package y2024m1.week5

fun main() {
    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        if (a + b == 0) break

        if (a > b) println("Yes")
        else println("No")
    }
}