package y2024m9

import java.util.LinkedList

private var n = 0
private val dirs = listOf(
    0 to -1,
    0 to 1,
    -1 to 0,
    1 to 0
)

fun main() {
    n = readln().toInt()
    val colors = Array(n) { readln() }
    val visited1 = Array(n) { BooleanArray(n) }
    val visited2 = Array(n) { BooleanArray(n) }

    var cnt1 = 0
    var cnt2 = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited1[i][j]) {
                cnt1++
                bfs(colors, visited1, j, i, false)
            }

            if (!visited2[i][j]) {
                cnt2++
                bfs(colors, visited2, j, i, true)
            }
        }
    }

    print("$cnt1 $cnt2")
}

private fun bfs(colors: Array<String>, visited: Array<BooleanArray>, x: Int, y: Int, isCB: Boolean) {
    val color = colors[y][x]
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(x to y)
    visited[y][x] = true

    while (queue.isNotEmpty()) {
        val (cx, cy) = queue.poll()

        for ((dx, dy) in dirs) {
            val nx = cx + dx
            val ny = cy + dy

            if (nx in 0 until n && ny in 0 until n && !visited[ny][nx]) {
                val nc = colors[ny][nx]

                if (check(color, nc, isCB)) {
                    visited[ny][nx] = true
                    queue.add(nx to ny)
                }
            }
        }
    }
}

private fun check(color1: Char, color2: Char, isCB: Boolean): Boolean {
    return if (isCB && (color1 == 'R' || color1 == 'G') && (color2 == 'R' || color2 == 'G')) {
        true
    } else  {
        color1 == color2
    }
}