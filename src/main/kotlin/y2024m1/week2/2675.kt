package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = Array(n) {""}

    for (i in 0 until n) {
        val repeat = nextInt()
        val str = next()
        var st = ""

        for (element in str) {
            for (k in 0 until repeat) {
                st += element
            }
        }
        arr[i] = st
    }

    for (i in 0 until n) {
        println(arr[i])
    }
}