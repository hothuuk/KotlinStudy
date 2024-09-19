package y2024m9

import java.util.LinkedList

fun main() {
    val sb = StringBuilder()

    while (true) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        if (x * y == 0) break

        val map = Array(y) { readln().split(" ").map { it.toInt() }.toTypedArray() }
        val visited = Array(y) { BooleanArray(x) }
        var cnt = 0

        for (i in 0 until y) {
            for (j in 0 until x) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt++
                    bfs(map, visited, j, i)
                }
            }
        }

        sb.append(cnt).append("\n")
    }

    print(sb)
}

private fun bfs(map: Array<Array<Int>>, visited: Array<BooleanArray>, startX: Int, startY: Int) {
    val dir = listOf(
        Pair(0, -1), // 위
        Pair(0, 1), // 아
        Pair(-1, 0), // 왼
        Pair(1, 0), // 오
        Pair(-1, -1), // 왼위
        Pair(1, -1), // 오위
        Pair(-1, 1), // 왼아
        Pair(1, 1) // 오아
    )

    val q = LinkedList<Pair<Int, Int>>()
    q.add(Pair(startX, startY))
    visited[startY][startX] = true

    while (q.isNotEmpty()) {
        val (x, y) = q.poll()

        for ((dx, dy) in dir) {
            val nx = x + dx
            val ny = y + dy

            if (nx in map[0].indices && ny in map.indices && map[ny][nx] == 1 && !visited[ny][nx]) {
                visited[ny][nx] = true
                q.add(nx to ny)
            }
        }
    }
}