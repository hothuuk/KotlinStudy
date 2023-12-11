package y2023m12.day3

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 1
    var n = sc.nextInt()
    var a = sc.nextInt()
    var b = sc.nextInt()

    while (a != b) {
        a = (a / 2) + (a % 2)
        b = (b / 2) + (b % 2)
        cnt++
    }

    print(cnt - 1)
}