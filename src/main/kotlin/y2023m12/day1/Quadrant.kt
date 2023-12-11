package y2023m12.day1

import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    var x = sc.nextInt()
    var y = sc.nextInt()

    if (x > 0) {
        if (y > 0) {
            print("1")
        } else {
            print("4")
        }
    } else {
        if (y > 0) {
            print("2")
        } else {
            print("3")
        }
    }
}