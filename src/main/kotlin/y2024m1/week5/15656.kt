package y2024m1.week5

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val nums2 = nums.sorted().toIntArray()

    val arr = IntArray(m)
    val sb = StringBuilder()

    fun find(len: Int) {
        if (len == m) {
            arr.forEach { sb.append(it).append(' ') }
            sb.append('\n')
            return
        }

        for (i in 0 until  n) {
            arr[len] = nums2[i]
            find(len + 1)
        }
    }

    find(0)
    print(sb)
}