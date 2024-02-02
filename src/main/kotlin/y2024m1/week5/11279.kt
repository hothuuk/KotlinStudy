package y2024m1.week5

import java.util.*

fun main() {
    val n = readln().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val sb = StringBuilder()

    repeat(n) {
        val m = readln().toInt()

        if (m == 0) {
            if (pq.isEmpty()) {
                sb.append("0\n")
            } else {
                sb.append(pq.poll()).append("\n")
            }
        } else {
            pq.offer(m)
        }
    }

    print(sb)
}