package y2023m12.day1

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val total = sc.nextInt()
    val n = sc.nextInt()
    var a:Int
    var b:Int
    var num:Int = 0

    for (i in 1..n) {
        a = sc.nextInt()
        b = sc.nextInt()
        num += a * b
    }

    if (total == num) {
        print("Yes")
    } else {
        print("No")
    }
}