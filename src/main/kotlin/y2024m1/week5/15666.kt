package y2024m1.week5

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val nums2 = nums.sorted().toIntArray()

    val set = HashSet<String> ()
    val arr = IntArray(m)
    val sb = StringBuilder()

    fun find(len: Int, idx: Int) {
        if (len == m) {
            val tmp = StringBuilder()
            arr.forEach { tmp.append(it).append(' ') }

            if (!set.contains(tmp.toString())) {
                sb.append(tmp).append('\n')
                set.add(tmp.toString())
            }

            return
        }

        for (i in idx until n) {
            arr[len] = nums2[i]
            find(len + 1, i)
        }
    }

    find(0, 0)
    print(sb)
}