package y2024m2.week3

import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

private lateinit var map: Array<CharArray>

private val dx = arrayOf(0, 0, 1, -1)
private val dy = arrayOf(1, -1, 0, 0)
private var N = 0
private var M = 0

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    N = n
    M = m

    map = Array(n) { CharArray(m) }

    for (i in 0 until n) {
        val str = readln().toCharArray()
        map[i] = str
    }

    var max = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 'L') {
                max = max(max, bfs(j, i))
            }
        }
    }

    print(max - 1)
}

private fun bfs(x: Int, y: Int): Int {

    val visit = Array(N) { IntArray(M) }

    val queue = LinkedList<Pair<Int, Int>>() as Queue<Pair<Int, Int>>

    queue.add(Pair(y, x))
    visit[y][x] = 1

    var max = 0

    while (queue.isNotEmpty()) {
        val target = queue.poll()

        for (i in 0 until 4) {
            val ny = target.first + dy[i]
            val nx = target.second + dx[i]

            if (nx !in 0 until M || ny !in 0 until N || visit[ny][nx] != 0 || map[ny][nx] == 'W') continue

            queue.add(Pair(ny, nx))
            visit[ny][nx] = visit[target.first][target.second] + 1

            max = max(max, visit[ny][nx])
        }
    }

    return max
}