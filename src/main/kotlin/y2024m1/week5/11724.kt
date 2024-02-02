package y2024m1.week5

private lateinit var graph: Array<Array<Int>>
private lateinit var visit: Array<Boolean>

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    graph = Array(n + 1) { Array(n + 1) { 0 } }
    visit = Array(n + 1) { false }

    var cnt = 0

    repeat(m) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        graph[x][y] = 1
        graph[y][x] = 1
    }

    for (i in 1 .. n) {
        if (!visit[i]) {
            dfs(i, n)
            cnt++
        }
    }

    print(cnt)
}

private fun dfs(node: Int, n: Int) {
    visit[node] = true

    for (i in 1 .. n) {
        if (graph[node][i] == 1 && !visit[i]) {
            dfs(i, n)
        }
    }
}