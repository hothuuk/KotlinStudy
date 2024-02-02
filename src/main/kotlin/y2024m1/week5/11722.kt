package y2024m1.week5

import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }

    val dp = Array(n) {1}

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (nums[i] < nums[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }

    print(dp.max())
}