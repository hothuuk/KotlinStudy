package y2024m8

fun main() {
    while (true) {
        val (n, m) = readln().split(" ").map { it.toInt() }

        if (n * m == 0) break

        if (m % n == 0) println("factor")
        else if (n % m == 0) println("multiple")
        else println("neither")
    }
}