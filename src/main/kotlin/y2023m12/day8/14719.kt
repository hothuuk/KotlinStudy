package y2023m12.day8

import java.util.StringTokenizer

fun main() {
    var st = StringTokenizer(readln())

    val y = st.nextToken().toInt()
    val x = st.nextToken().toInt()
    val map = Array(y) { Array(x) { 0 } }
    val wall = Array(x) { 0 }
    var rain = 0

    st = StringTokenizer(readln())
    for (i in 0 until x) {
        wall[i] = st.nextToken().toInt()
    }

    for (y1 in y - 1 downTo 0) {
        for (x1 in 0 until x) {
            if (wall[x1] >= 1) {
                map[y1][x1]++
                wall[x1]--
            }
        }
    }

    for (y1 in 0 until y) {
        var wall1 = -1
        var wall2 = -1

        for (x1 in 0 until x) {
            if (map[y1][x1] == 1) {
                wall2 = x1
                if (wall2 != 0 && wall1 != -1) {
                    rain += wall2 - wall1 - 1
                }
                wall1 = x1
            }
        }
    }

    print(rain)
}