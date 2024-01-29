package y2024m1.week5

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val arr = IntArray(m)
    val sb = StringBuilder()

    fun find(len: Int, idx: Int) {
        if (len == m) {
            arr.forEach { sb.append(it).append(' ') }
            sb.append('\n')
            return
        }

        for (i in idx .. n) {
            arr[len] = i
            find(len + 1, i)
        }
    }

    find(0, 1)
    print(sb)
}