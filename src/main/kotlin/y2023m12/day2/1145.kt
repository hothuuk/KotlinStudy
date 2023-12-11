package y2023m12.day2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = Array(5) {0}

    for (i in 1..5) {
        arr[i - 1] = sc.nextInt()
    }

    for (i in 1..Int.MAX_VALUE) {
        var cnt = 0

        for (j in 1..5) {
            if (i % arr[j - 1] == 0) cnt++
        }

        if (cnt >= 3) {
            print(i)
            return
        }
    }
}