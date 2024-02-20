package y2024m2.week4

import kotlin.math.max

fun main() {
    val a = readln()
    val b = readln()

    val aLength = a.length
    val bLength = b.length

    val dp = Array(aLength + 1) { Array(bLength + 1) {0} }

    for (i in 1 .. aLength) {
        for (j in 1 .. bLength) {
            if (a[i - 1] == b[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1
            else dp[i][j] = max(dp[i][j - 1], dp[i - 1][j])
        }
    }

    print(dp[aLength][bLength])
}