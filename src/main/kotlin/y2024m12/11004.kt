package y2024m12

import java.util.PriorityQueue

fun main() {
    val (_, k) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(compareByDescending { it })

    for (num in nums) {
        pq.add(num)

        if (pq.size > k) {
            pq.poll()
        }
    }

    print(pq.peek())
}