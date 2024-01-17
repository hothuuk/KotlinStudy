package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val lank = Array(n) {1}
    val people = Array(n) {Array(2) {0} }

    repeat(n) {
        for (i in 0 .. 1) {
            people[it][i] = nextInt()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                lank[i]++
            }
        }
    }

    repeat(n) {
        print("${lank[it]} ")
    }
}