package day1

import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    if (a > b) {
        print(">")
    } else if (a < b) {
        print("<")
    } else {
        print("==")
    }
}