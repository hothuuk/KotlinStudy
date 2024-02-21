package y2024m2.week4

import java.util.*

private data class Point(val pos: Int, val count: Int): Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return count - other.count
    }
}

private val isVisited = BooleanArray(100001)

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    println(bfs(n, k))
}

fun bfs(n: Int, k: Int): Int {

    val queue = PriorityQueue<Point>()

    queue.offer(Point(n, 0))

    while (queue.isNotEmpty()) {

        val point = queue.poll()

        isVisited[point.pos] = true

        if (point.pos == k) {
            return point.count
        }

        if (point.pos * 2 <= 100000 && !isVisited[point.pos * 2]) {
            queue.offer(Point(point.pos * 2, point.count))
        }

        if (point.pos - 1 >= 0 && !isVisited[point.pos - 1]) {
            queue.offer(Point(point.pos - 1, point.count + 1))
        }

        if (point.pos + 1 <= 100000 && !isVisited[point.pos + 1]) {
            queue.offer(Point(point.pos + 1, point.count + 1))
        }
    }

    return -1
}
