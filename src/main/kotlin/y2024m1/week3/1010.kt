package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val n = nextInt()

    repeat(n) {
        val a = nextInt()
        val b = nextInt()

        var sum = 1

        for (i in 1 .. a) sum = sum * (b - i + 1) / i

        println(sum)
    }
}