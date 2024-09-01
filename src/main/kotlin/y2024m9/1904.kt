package y2024m9

fun main() {
    val n = readln().toInt()

    if (n <= 2) {
        print(n)
        return
    }

    val dp = IntArray(n + 1)

    dp[1] = 1
    dp[2] = 2

    for (i in 3 .. n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 15746
    }

    print(dp[n])
}