package y2024m1.week4

import kotlin.math.max

fun main() {

    val n = readln().toInt()
    val num = IntArray(n) { readln().toInt() }
    val dp = IntArray(n + 1)

    dp[1] = num[0]

    if (n > 1) {
        dp[2] = num[0] + num[1]
    }

    for (i in 3 .. n) {
        dp[i] = max(dp[i - 2], num[i - 2] + dp[i - 3]) + num[i - 1]
    }

    print(dp[n])
}