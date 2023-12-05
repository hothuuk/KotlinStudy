package day1

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while (sc.hasNextInt()) {
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a+b)
    }
}