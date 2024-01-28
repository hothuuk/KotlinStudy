package y2024m1.week4

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val visited = Array(n + 1) {false}
    val arr = IntArray(m)
    val sb = StringBuilder()

    fun find(len: Int, idx: Int) {
        if (len == m) {
            arr.forEach { sb.append(it).append(' ') }
            sb.append('\n')
            return
        }

        for (i in idx .. n) {
            if (!visited[i]) {
                visited[i] = true
                arr[len] = i
                find(len + 1, i)
                visited[i] = false
            }
        }
    }

    find(0, 1)
    print(sb)
}