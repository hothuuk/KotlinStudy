package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextLong()
    val b = nextLong()
    val c = nextLong()
    print(division(a, b, c))
}

fun division(a: Long, b: Long, c: Long): Long {
    if (b == 1L) return a % c

    return if (b % 2 == 0L) {
        val answer = division(a, b / 2, c)
        (answer * answer) % c
    } else {
        val answer = division(a, b / 2, c)
        (((answer * answer) % c) * a) % c
    }
}