package y2023m12.day7

import java.util.StringTokenizer

fun main() {
    var st = StringTokenizer(readln())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val picture = Array(101) {IntArray(101) {0} }
    var answer = 0

    for (i in 0 until n) {

        st = StringTokenizer(readln())

        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()

        for (y in y1..y2) {
            for (x in x1..x2) {
                picture[y][x]++
                if (picture[y][x] > m) {
                    answer++
                    picture[y][x] = -100
                }
            }
        }
    }

    print(answer)
}