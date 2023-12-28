package y2023m12.day8

import java.util.StringTokenizer

fun main() {
    val n = 4
    val arr = Array(101) {IntArray(101) {0}}
    var answer = 0

    for (i in 0 until n) {
        val st = StringTokenizer(readln())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()

        for (y in y1 until  y2) {
            for (x in x1 until  x2) {
                if (arr[y][x] == 0) answer++
                arr[y][x]++
            }
        }
    }

    print(answer)
}