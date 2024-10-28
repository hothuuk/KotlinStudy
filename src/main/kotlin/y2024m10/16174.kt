package y2024m10

import java.util.LinkedList

fun main() {
    val s = readln().toInt()
    val map = Array(s) { readln().split(" ").map { it.toInt() }.toIntArray() }

    fun bfs(): String {
        val dir = arrayOf(1 to 0, 0 to 1)
        val q = LinkedList<Pair<Int, Int>>()
        val visited = Array(s) { BooleanArray(s) }

        q.add(0 to 0)
        visited[0][0] = true

        while (q.isNotEmpty()) {
            val (x, y) = q.poll()
            val d = map[y][x]

            for ((dx, dy) in dir) {
                val (nx, ny) = (x + (dx * d)) to (y + (dy * d))

                if (nx in 0 until s && ny in 0 until s && !visited[ny][nx]) {
                    if (map[ny][nx] == -1) return "HaruHaru"

                    if (nx != x || ny != y) {
                        q.add(nx to ny)
                        visited[ny][nx] = true
                    }
                }
            }
        }

        return "Hing"
    }

    print(bfs())
}