package y2024m1.week5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

private lateinit var arr: Array<Array<Int>>
private lateinit var visit: Array<Boolean>

private var n = 0
private var m = 0
private var cnt = 0

private var sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    val v = st.nextToken().toInt()

    arr = Array(n + 1) {Array(n + 1) {0} }
    visit = Array(n + 1) {false}

    repeat(m) {
        st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        arr[y][x] = 1
        arr[x][y] = 1
    }

    dfs(v)
    sb.append("\n")

    visit = Array(n + 1) {false}

    bfs(v)

    print(sb)
}

fun dfs(node: Int) {
    visit[node] = true
    sb.append("$node ")

    if (cnt == n) {
        return
    }

    cnt++

    for (i in 1 .. n) {
        if (arr[node][i] == 1 && !visit[i]) {
            dfs(i)
        }
    }
}

fun bfs(node: Int) {
    val queue = LinkedList<Int>()

    queue.offer(node)
    visit[node] = true
    sb.append("$node ")

    while (queue.isNotEmpty()) {
        val num = queue.poll()

        for (i in 1 .. n) {
            if (arr[num][i] == 1 && !visit[i]) {
                queue.offer(i)
                visit[i] = true
                sb.append("$i ")
            }
        }
    }

    queue.clear()
}