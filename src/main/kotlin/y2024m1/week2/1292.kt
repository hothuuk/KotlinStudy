package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val arr = ArrayList<Int> ()
    var sum = 0

    for (i in 1 .. 100) {
        for (j in 1 .. i) {
            arr.add(i)
        }
    }

    val a = nextInt()
    val b = nextInt()

    for (i in a - 1 until b) {
        sum += arr[i]
    }

    print(sum)
}