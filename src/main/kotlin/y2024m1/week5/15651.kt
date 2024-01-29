package y2024m1.week5

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val arr = IntArray(m)
    val sb = StringBuilder()

    fun find(len: Int) {
        if (len == m) {
            arr.forEach { sb.append(it).append(' ') }
            sb.append('\n')
            return
        }

        for (i in 1 .. n) {
            arr[len] = i
            find(len + 1)
        }
    }

    find(0)
    print(sb)
}