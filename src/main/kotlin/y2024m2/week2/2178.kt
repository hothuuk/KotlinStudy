package y2024m2.week2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private data class Node(val x: Int, val y: Int)

private val dx = arrayOf(0, 0, 1, -1)
private val dy = arrayOf(1, -1, 0, 0)

private lateinit var map: Array<Array<Int>>

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val nm = br.readLine().split(" ").map { it.toInt() }
    val n = nm[0]
    val m = nm[1]

    map = Array(n) { Array(m) {0} }

    repeat(n) { x ->
        val line = br.readLine()
        repeat(m) { y ->
            map[x][y] = line[y] - '0'
        }
    }

    bfs(n, m)
}

private fun bfs(n: Int, m: Int) {
    val q: Queue<Node> = LinkedList()
    val visited = Array(n) { Array(m) { 1 } }

    q.offer(Node(0, 0))

    while (q.isNotEmpty()) {
        val target = q.poll()

        for (i in 0 until 4) {
            val nx = target.x + dx[i]
            val ny = target.y + dy[i]

            if (nx !in 0 until n || ny !in 0 until m || map[nx][ny] == 0 || visited[nx][ny] != 1)
                continue

            q.offer(Node(nx, ny))
            visited[nx][ny] = visited[target.x][target.y] + 1

            if (nx == n - 1 && ny == m - 1) {
                print(visited[nx][ny])
                break
            }
        }
    }
}
