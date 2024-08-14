package y2024m8

import java.util.PriorityQueue

fun main() {
    val n = readln().toInt()
    var dasom = readln().toInt()
    val candidates = PriorityQueue<Int> (compareByDescending { it })

    repeat(n - 1) {
        candidates.add(readln().toInt())
    }

    var buy = 0

    while (candidates.isNotEmpty() && candidates.peek() >= dasom) {
        candidates.add(candidates.poll() - 1)
        dasom++
        buy++
    }

    print(buy)
}