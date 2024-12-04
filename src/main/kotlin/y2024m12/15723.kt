package y2024m12

import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val graph = Array(26) { BooleanArray(26) }

    repeat(n) {
        val (a, b) = readln().split("is").map { it.trim()[0] - 'a' }
        graph[a][b] = true
    }

    val m = readln().toInt()
    val sb = StringBuilder()

    fun bfs(s: Int, t: Int): Boolean {
        val q = LinkedList<Int>()
        val visited = BooleanArray(26)
        q.add(s)
        visited[s] = true

        while (q.isNotEmpty()) {
            val c = q.poll()

            for (next in 0 until 26) {
                if (graph[c][next] && !visited[next]) {
                    if (next == t) return true

                    q.add(next)
                    visited[next] = true
                }
            }
        }

        return false
    }

    repeat(m) {
        val (a, b) = readln().split("is").map { it.trim()[0] - 'a' }
        sb.append(if (bfs(a, b)) "T" else "F").append("\n")
    }

    print(sb)
}