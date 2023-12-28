package y2023m12.day8

import java.util.StringTokenizer

var n = 0
var m = 0
var hour = 0
val dx = arrayOf(0, 0, 1, -1)
val dy = arrayOf(1, -1, 0, 0)
lateinit var cheese: Array<Array<Int>>
lateinit var visited: Array<Array<Int>>

fun main() {
    var st = StringTokenizer(readln())

    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    cheese = Array(n) {Array(m) {0} }
    visited = Array(n) {Array(m) {0} }

    for (y in 0 until n) {
        st = StringTokenizer(readln())
        for (x in 0 until m) {
            cheese[y][x] = st.nextToken().toInt()
        }
    }

    while (true) {
        var sum = 0
        cheese.forEach { it.forEach { sum += it } }
        if (sum == 0) break

        dfs(0, 0)

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (visited[i][j] >= 2) cheese[i][j] = 0
                visited[i][j] = 0
            }
        }

        hour++
    }

    print(hour)
}

fun dfs(x: Int, y: Int) {

    if (cheese[x][y] == 1) {
        visited[x][y]++
        return
    }

    visited[x][y] = 2

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx !in 0 until n || ny !in 0 until m || visited[nx][ny] >= 2) continue

        dfs(nx, ny)
    }
}