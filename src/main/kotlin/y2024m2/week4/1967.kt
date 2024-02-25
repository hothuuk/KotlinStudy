package y2024m2.week4

import java.io.BufferedReader
import java.io.InputStreamReader

private var maxNode = 0
private var maxWeight = Int.MIN_VALUE

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val arr = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }
    var visit = BooleanArray(n + 1)

    repeat(n - 1) {
        val (parent, child, weight) = readLine().split(" ").map { it.toInt() }
        arr[parent].add(Pair(child, weight))
        arr[child].add(Pair(parent, weight))
    }

    dfs(1, 0, arr, visit)

    visit = BooleanArray(n + 1)

    maxWeight = Int.MIN_VALUE

    dfs(maxNode, 0, arr, visit)
    println(maxWeight)
}

private fun dfs(node: Int, weight: Int, arr: Array<MutableList<Pair<Int, Int>>>, visit: BooleanArray) {

    if (weight > maxWeight) {
        maxNode = node
        maxWeight = weight
    }

    visit[node] = true

    for (next in arr[node]) {
        if (!visit[next.first]) {
            dfs(next.first, weight + next.second, arr, visit)
        }
    }
}