package y2024m11

fun main() {
    val n = readln().toInt()
    val map = Array(n) { readln().split(" ").map { it.toInt() } }
    val dp = Array(n) { LongArray(n) }

    dp[0][0] = 1

    for (i in 0 until n) {
        for (j in 0 until n) {
            val jump = map[i][j]
            val cnt = dp[i][j]

            if (cnt == 0L || jump == 0) continue

            if (i + jump < n) {
                dp[i + jump][j] += cnt
            }

            if (j + jump < n) {
                dp[i][j + jump] += cnt
            }
        }
    }

    print(dp[n - 1][n - 1])
}