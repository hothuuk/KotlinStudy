package y2024m1.week4

import java.util.Collections
import java.util.LinkedList

lateinit var queue: LinkedList<Pair<Int, Boolean>>

fun main() {
    val t = readln().toInt()

    queue = LinkedList<Pair<Int, Boolean>> ()

    repeat(t) {
        val (n, idx) = readln().split(" ").map { it.toInt() }
        val arr = readln().split(" ")

        for (i in 0 until n) {
            queue.add(Pair(arr[i].toInt(), i == idx))
        }

        println(cal())
        queue.clear()
    }
}

fun cal(): Int {

    var cnt = 0

    while (true in queue.map { it.second }) {
        if (queue.peek().first != Collections.max(queue.map { it.first })) {
            queue.add(Pair(queue.peek().first, queue.peek().second))
            queue.remove()
        } else {
            cnt++
            queue.remove()
        }
    }

    return cnt
}