package y2024m11

import java.util.LinkedList

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[b].add(a)
    }

    fun bfs(start: Int): Int {
        val q = LinkedList<Int>()
        val visited = BooleanArray(n + 1)
        var cnt = 0

        q.add(start)
        visited[start]

        while (q.isNotEmpty()) {
            val node = q.poll()

            for (next in graph[node]) {
                if (!visited[next]) {
                    visited[next] = true
                    cnt++
                    q.add(next)
                }
            }
        }

        return cnt
    }

    print(bfs(readln().toInt()))
}