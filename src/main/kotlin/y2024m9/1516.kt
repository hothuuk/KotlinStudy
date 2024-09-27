package y2024m9

import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val times = IntArray(n + 1)
    val graph = List(n + 1) { mutableListOf<Int>() }
    val degree = IntArray(n + 1)

    for (i in 1..n) {
        val input = readln().split(" ").map { it.toInt() }
        times[i] = input[0]

        for (j in 1 until input.size - 1) {
            graph[input[j]].add(i)
            degree[i]++
        }
    }

    val result = bfs(n, times, graph, degree)

    println(result.drop(1).joinToString("\n"))
}

private fun bfs(n: Int, times: IntArray, graph: List<List<Int>>, degree: IntArray): IntArray {
    val q = LinkedList<Int>()
    val result = IntArray(n + 1)

    for (i in 1..n) {
        if (degree[i] == 0) {
            q.add(i)
            result[i] = times[i]
        }
    }

    while (q.isNotEmpty()) {
        val cur = q.poll()

        for (next in graph[cur]) {
            degree[next]--
            result[next] = maxOf(result[next], result[cur] + times[next])

            if (degree[next] == 0) {
                q.add(next)
            }
        }
    }

    return result
}