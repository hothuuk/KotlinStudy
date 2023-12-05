package day4

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val key = sc.nextInt()
    val check = Array(n) {true}
    val answer = IntArray(n)
    var head = 0

    for (i in 0 until n) {
        for (j in 0 until key) {
            if (!check[head]) head++
            head++
            if (head >= n) head -= n - 1

            print("$head ")
        }

        check[head - 1] = false
        answer[i] = head

        for (j in 0 until n) {
            print("${check[j]} ")
        }
        println()
    }

    print("<${answer[0]}, ")
    for (i in 1..n-2) {
        print("${answer[i]}, ")
    }
    print("${answer[n - 1]}>")
}