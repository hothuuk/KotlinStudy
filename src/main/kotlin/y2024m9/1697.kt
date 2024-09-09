package y2024m9

import java.util.LinkedList

fun main() {
    val operations: Array<(Int) -> Int> = arrayOf(
        { x -> x + 1 },
        { x -> x - 1 },
        { x -> x * 2 }
    )

    val (n, k) = readln().split(" ").map { it.toInt() }
    val visited = BooleanArray(100001)
    val queue = LinkedList<Pair<Int, Int>>()

    queue.add(Pair(n, 0))
    visited[n] = true

    while (queue.isNotEmpty()) {
        val (c, t) = queue.poll()

        if (c == k) {
            print(t)
            return
        }

        for (operation in operations) {
            val oc = operation(c)

            if (oc in 0 .. 100000 && !visited[oc]) {
                queue.add(Pair(oc, t + 1))
                visited[oc] = true
            }
        }
    }
}