package y2024m12

fun main() {
    val n = readln().toInt()
    val dp = LongArray(n + 1)
    dp[0] = 2

    for (i in 1 .. n) {
        dp[i] = dp[i - 1] * 2 - 1
    }

    val ans = dp[n]
    print(ans * ans)
}