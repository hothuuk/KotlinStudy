package y2024m2.week2

import java.util.PriorityQueue
import kotlin.math.abs

fun main() {
    val sb = StringBuilder()

    val pq = PriorityQueue<Int> { o1, o2 ->
        val abs1 = abs(o1)
        val abs2 = abs(o2)

        when (abs1) {
            abs2 -> o1 - o2
            else -> abs1 - abs2
        }
    }

    var n = readln().toInt()

    while (n --> 0) {
        val m = readln().toInt()

        if (m != 0) pq.offer(m)
        else {
            if (pq.isEmpty()) sb.append("0\n")
            else sb.append(pq.poll()).append("\n")
        }
    }

    print(sb)
}