package y2024m1.week3

import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val q = LinkedList<Int> ()

    repeat(n) {
        q.add(it + 1)
    }

    while (q.size > 1) {
        q.pollFirst()
        val tmp = q.pollFirst()
        q.offerLast(tmp)
    }

    print(q[0])
}