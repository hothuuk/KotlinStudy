package y2024m1.week3

import kotlin.math.floor

fun main() {
    val (money, year) = readln().split(" ").map { it.toInt() }

    val dp = DoubleArray(year + 1)
    dp[0] = money.toDouble()

    for (i in 1 .. year) {
        dp[i] = floor(dp[i - 1] * 1.05)
        if (i >= 3) dp[i] = floor(dp[i - 3] * 1.2).coerceAtLeast(dp[i])
        if (i >= 5) dp[i] = floor(dp[i - 5] * 1.35).coerceAtLeast(dp[i])
    }

    print(dp[year].toInt())
}