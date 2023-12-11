package y2023m12.day1

import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    var h = sc.nextInt()
    var m = sc.nextInt()

    if (m >= 45) {
        m -= 45
        print("$h $m")
    } else {
        m += 15

        if (h == 0) {
            h = 23
        } else {
            h -= 1
        }

        print("$h $m")
    }
}