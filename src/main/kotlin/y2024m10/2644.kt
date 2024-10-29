package y2024m10

fun main() {
    val n = readln().toInt()
    val (ta, tb) = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()
    val graph = Array(n + 1) { BooleanArray(n + 1) }

    repeat(m) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        graph[x][y] = true
        graph[y][x] = true
    }

    val visited = BooleanArray(n + 1)

    fun dfs(node: Int, depth: Int): Int {
        if (node == tb) return depth

        visited[node] = true

        for (i in 1 .. n) {
            if (graph[node][i] && !visited[i]) {
                val result = dfs(i, depth + 1)
                if (result != -1) return result
            }
        }

        return -1
    }


    print(dfs(ta, 0))
}
