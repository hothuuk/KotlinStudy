package y2023m12.day2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var arr1 = Array(n) {0}
    var arr2 = Array(n) {0}
    var sum = 0

    for (i in 1..n) {
        arr1[i - 1] = sc.nextInt()
    }

    for (i in 1..n) {
        arr2[i - 1] = sc.nextInt()
    }

    arr1 = arr1.sortedArray()
    arr2 = arr2.sortedDescending().toTypedArray()

    for (i in 1..n) {
        sum += arr1[i - 1] * arr2[i - 1]
    }

    print(sum)
}