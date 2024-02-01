package y2024m1.week5

import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val dp = IntArray(n)

    dp[0] = nums[0]

    var max = nums[0]

    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + nums[i], nums[i])
        max = max(max, dp[i])
    }

    print(max)
}