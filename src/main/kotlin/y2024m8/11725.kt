package y2024m8

import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val tree = Array(n + 1) { ArrayList<Int>() }

    repeat(n - 1) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        tree[a].add(b)
        tree[b].add(a)
    }

    val queue = LinkedList<Int>()
    val visit = BooleanArray(n + 1)
    val answer = IntArray(n + 1)

    queue.add(1)
    visit[1] = true

    while (queue.isNotEmpty()) {
        val current = queue.pop()

        for (next in tree[current]) {
            if (visit[next]) continue

            visit[next] = true
            answer[next] = current
            queue.add(next)
        }
    }

    for (i in 2 .. n) {
        println(answer[i])
    }
}