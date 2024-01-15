package y2024m1.week2

import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    var min = 0
    var max = 0

    var n = 1

    while (true) {
        if (a % n == 0 && b % n == 0) min = n
        if (n % a == 0 && n % b == 0) {
            max = n
            break
        }

        n++
    }

    print("$min\n$max")
}