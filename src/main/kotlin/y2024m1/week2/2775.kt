package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val arr = Array(15) { Array(15) { 0 } }

    for (i in 0 until 15) {
        for (j in 0 until 15) {
            if (i == 0 || j == 0) arr[i][j] = j + 1
            else arr[i][j] = arr[i][j - 1] + arr[i - 1][j]
        }
    }

    val t = nextInt()

    for (i in 0 until t) {
        val k = nextInt()
        val n = nextInt()
        println(arr[k][n - 1])
    }
}