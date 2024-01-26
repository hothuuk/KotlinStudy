package y2024m1.week4

import java.util.LinkedList
import java.util.Queue

lateinit var map: Array<Array<Boolean>>

fun main() {

    val n = readln().toInt()
    val con = readln().toInt()
    map = Array(n + 1) {Array(n + 1) {false} }

    repeat(con) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        map[y][x] = true
        map[x][y] = true
    }

    bfs(n)
}

fun bfs(n: Int) {

    val q: Queue<Int> = LinkedList()
    val visited = Array(n + 1) {false}
    visited[1] = true

    q.offer(1)

    var cnt = 0

    while (q.isNotEmpty()) {
        val target = q.poll()

        for (i in map.indices) {
            if (!visited[i] && map[target][i]) {
                q.offer(i)
                visited[i] = true
                cnt++
            }
        }
    }

    print(cnt)
}