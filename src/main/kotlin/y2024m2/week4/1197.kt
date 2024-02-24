package y2024m2.week4

private lateinit var parent: IntArray
private lateinit var graph: Array<IntArray>

fun main() {
    val (v, e) = readln().split(" ").map { it.toInt() }

    graph = Array(e) { IntArray(3) }
    parent = IntArray(v + 1)

    for (i in 0 until e) {
        graph[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in parent.indices) {
        parent[i] = i
    }

    graph.sortWith { o1, o2 -> o1[2] - o2[2] }

    var sum = 0

    for (i in graph.indices) {
        if (find(graph[i][0]) != find(graph[i][1])) {
            sum += graph[i][2]
            union(graph[i][0], graph[i][1])
        }
    }

    print(sum)
}

private fun find(node: Int): Int {
    if (parent[node] == node) return node
    return find(parent[node])
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    if (aParent < bParent) parent[bParent] = aParent
    else parent[aParent] = bParent
}