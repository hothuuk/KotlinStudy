package y2024m1.week2

import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()

    val st = StringTokenizer(readln())
    var answer = 0

    for (i in 0 until n) {
        val m = st.nextToken().toInt()
        var cnt = 0

        for (j in 1 .. m) {
            if (m % j == 0) cnt++
        }

        if (cnt == 2) answer++
    }

    print(answer)
}