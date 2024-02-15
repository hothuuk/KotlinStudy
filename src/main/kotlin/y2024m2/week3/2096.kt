package y2024m2.week3

import kotlin.math.*

fun main() {
    val n = readln().toInt()
    val nums = Array(n) { IntArray(3) }

    repeat(n) { i ->
        nums[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    val maxDP = Array(n) { IntArray(3) }
    val minDP = Array(n) { IntArray(3) }

    maxDP[0][0] = nums[0][0]
    maxDP[0][1] = nums[0][1]
    maxDP[0][2] = nums[0][2]

    minDP[0][0] = nums[0][0]
    minDP[0][1] = nums[0][1]
    minDP[0][2] = nums[0][2]

    for (i in 1 until n) {
        maxDP[i][0] = nums[i][0] + max(maxDP[i - 1][0], maxDP[i - 1][1])
        maxDP[i][1] = nums[i][1] + max(maxDP[i - 1][0], max(maxDP[i - 1][1], maxDP[i - 1][2]))
        maxDP[i][2] = nums[i][2] + max(maxDP[i - 1][1], maxDP[i - 1][2])

        minDP[i][0] = nums[i][0] + min(minDP[i - 1][0], minDP[i - 1][1])
        minDP[i][1] = nums[i][1] + min(minDP[i - 1][0], min(minDP[i - 1][1], minDP[i - 1][2]))
        minDP[i][2] = nums[i][2] + min(minDP[i - 1][1], minDP[i - 1][2])
    }

    print("${maxDP[n - 1].max()} ${minDP[n - 1].min()}")
}