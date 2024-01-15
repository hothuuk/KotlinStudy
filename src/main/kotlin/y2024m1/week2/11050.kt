package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val k = nextInt()

    print("${facto(n) / (facto(k) * facto(n - k))}")
}

fun facto(n: Int): Int {
    if (n == 1) return 1
    return n * facto(n - 1)
}