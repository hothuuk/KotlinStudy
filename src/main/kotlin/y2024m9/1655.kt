package y2024m9

import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val t = readln().toInt()
    val max = PriorityQueue<Int>(Collections.reverseOrder())
    val min = PriorityQueue<Int>()
    val sb = StringBuilder()

    repeat(t) {
        val n = readln().toInt()

        if (max.size == min.size) {
            max.add(n)
        } else {
            min.add(n)
        }

        if (max.isNotEmpty() && min.isNotEmpty()) {
            if (max.peek() > min.peek()) {
                val tmp = max.poll()
                max.add(min.poll())
                min.add(tmp)
            }
        }

        sb.append(max.peek()).append("\n")
    }

    print(sb)
}