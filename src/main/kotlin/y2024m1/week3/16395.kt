package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val pascal = Array(a) {Array(a) {0} }

    for (i in 0 until a) {
        for (j in 0 .. i) {
            if (j == 0 || j == i) pascal[i][j] = 1
            else {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]
            }
        }
    }

    print(pascal[a - 1][b - 1])
}