package y2024m12

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val sums = IntArray(n + 1)

    for (i in 1 .. n) {
        sums[i] = sums[i - 1] + nums[i - 1]
    }

    val m = readln().toInt()
    val sb = StringBuilder()

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        sb.append(sums[j] - sums[i - 1]).append("\n")
    }

    print(sb)
}