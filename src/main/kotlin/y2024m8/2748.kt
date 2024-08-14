package y2024m8

fun main() {
    val n = readln().toInt()
    val dp = Array(n + 2) { 0L }

    if (n <= 2) {
        print(1)
        return
    }

    dp[2] = 1L

    for (i in 3..n + 1) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    print(dp[n + 1])
}