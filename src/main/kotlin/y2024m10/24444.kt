package y2024m10

import java.util.LinkedList

fun main() {
    val (n, m, r) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    val order = IntArray(n + 1)

    repeat(m) {
        val (u, v) = readln().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    graph.map { it.sort() }

    fun bfs() {
        val queue = LinkedList<Int>()
        val visited = BooleanArray(graph.size)
        queue.add(r)
        visited[r] = true

        var nextOrder = 1

        while (queue.isNotEmpty()) {
            val u = queue.poll()
            val e = graph[u]
            order[u] = nextOrder++

            for (v in e) {
                if (!visited[v]) {
                    queue.add(v)
                    visited[v] = true
                }
            }
        }
    }

    bfs()
    print(order.drop(1).joinToString("\n"))
}