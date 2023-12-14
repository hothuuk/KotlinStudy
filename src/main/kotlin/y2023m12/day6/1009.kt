package y2023m12.day6

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = Array(n) {0}

    for (i in 0 until n) {
        var a = 1
        val b = sc.nextInt()
        val c = sc.nextInt()

        for (j in 0 until  c) {
            a *= b
            a %= 10
        }

        if (a == 0) a = 10
        arr[i] = a
    }

    for (i in 0 until n) {
        println(arr[i])
    }
}