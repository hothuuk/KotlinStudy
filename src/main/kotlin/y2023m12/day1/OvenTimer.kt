package y2023m12.day1

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var h = sc.nextInt()
    var m = sc.nextInt()
    val setTime = sc.nextInt()

    m += setTime
    h += m / 60
    m %= 60

    if (h >= 24) {
        h -= 24
    }

    print("$h $m")
}