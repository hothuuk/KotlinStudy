package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    while (true) {
        val str = next()
        if (str == "0") break

        val n = str.length / 2
        var head = 0
        var tail = str.length - 1

        var check = true

        for (i in 0 until n) {
            if (str[head] != str[tail]) check = false
            head++
            tail--
        }

        if (check) println("yes")
        else println("no")
    }
}