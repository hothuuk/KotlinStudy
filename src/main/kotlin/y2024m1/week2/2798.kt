package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val n = nextInt()
    val m = nextInt()

    val arr = Array(n) { 0 }

    for (i in 0 until n) {
        arr[i] = nextInt()
    }

    var sum: Int
    var max = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                sum = arr[i] + arr[j] + arr[k]
                if (sum in (max + 1)..m) max = sum
            }
        }
    }

    print(max)
}