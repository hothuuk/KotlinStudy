package day2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr1 = Array(n) {0}
    val arr2 = Array(n) {0}

    for (i in 1..n) {
        arr1[i - 1] = sc.nextInt()
    }

    val arr3 = arr1.sortedArray()

    for (i in 1..n) {
        for (j in 1..n) {
            if (arr1[j - 1] <= arr3[i - 1]) {
                arr2[j - 1] = i - 1
                arr1[j - 1] = 1001
                break
            }
        }
    }

    for (i in 1..n) {
        print("${arr2[i - 1]} ")
    }
}