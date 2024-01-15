package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var sum = 0

    repeat(5) {
        val n = nextInt()
        sum += n * n
    }

    print(sum % 10)
}