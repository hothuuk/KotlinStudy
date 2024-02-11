package y2024m2.week2

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val dp = Array(101) { IntArray(101) }

    for (i in 2 .. 100) {
        for (j in 2 .. 100) {
            if (i == j) {
                dp[i][j] = (i - 1) * 2
            } else if (i < j) {
                dp[i][j] = dp[i][i]
            } else  {
                dp[i][j] = dp[j][j] + 1
            }
        }
    }

    print(dp[n][m])
}