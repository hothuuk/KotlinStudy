package y2024m1.week1

import java.util.StringTokenizer

fun main() {
    var st = StringTokenizer(readln())

    val n = st.nextToken().toInt()
    val l = st.nextToken().toInt()

    val map = Array(n) { Array(n) { 0 } }
    var answer = 0

    for (y in 0 until n) {
        st = StringTokenizer(readln())
        for (x in 0 until n) {
            map[y][x] = st.nextToken().toInt()
        }
    }

    for (y in 0 until n) {
        var can = true
        val check = Array(n) { 0 }

        for (x in 0 until n - 1) {
            if (map[y][x] + 1 == map[y][x + 1]) {
                for (len in 0 until l) {
                    if (x - len >= 0 && check[x - len] != 1 && map[y][x] == map[y][x - len]) check[x - len]++
                    else can = false
                }
            }

            if (map[y][x] - 1 == map[y][x + 1]) {
                for (len in 0 until l) {
                    if (x + len < n && check[x + len] != 1 && map[y][x] == map[y][x + len]) check[x + len]++
                    else can = false
                }
            }

            if (map[y][x] + 2 <= map[y][x + 1]) can = false
        }
        if (can) answer++
    }

    for (x in 0 until n) {
        var can = true
        val check = Array(n) { 0 }

        for (y in 0 until n - 1) {
            if (map[y][x] + 1 == map[y + 1][x]) {
                for (len in 0 until l) {
                    if (y - len >= 0 && check[y - len] != 1 && map[y][x] == map[y - len][x]) check[y - len]++
                    else can = false
                }
            }

            if (map[y][x] - 1 == map[y + 1][x]) {
                for (len in 0 until l) {
                    if (y + len < n && check[y + len] != 1 && map[y][x] == map[y + len][x]) check[y + len]++
                    else can = false
                }
            }

            if (map[y][x] + 2 <= map[y + 1][x]) can = false
        }
        if (can) answer++
    }

    print(answer)
}