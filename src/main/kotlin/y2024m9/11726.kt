package y2024m9

fun main() {
    val n = readln().toInt()

    if (n <= 3) {
        print(n)
        return
    }

    val dp = IntArray(n + 1)

    dp[1] = 1
    dp[2] = 2
    dp[3] = 3

    for (i in 4 .. n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
    }

    print(dp[n])
}