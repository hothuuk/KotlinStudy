package y2024m10

fun main() {
    val k = readln().toInt()
    val dp = Array(k + 1) { Pair(0, 0) }
    dp[0] = Pair(1, 0)
    dp[1] = Pair(0, 1)

    for (i in 2 .. k) {
        dp[i] = Pair(dp[i - 1].first + dp[i - 2].first, dp[i - 1].second + dp[i - 2].second)
    }

    print("${dp[k].first} ${dp[k].second}")
}