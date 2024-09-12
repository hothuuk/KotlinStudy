package y2024m9

fun main() {
    val (y, x) = readln().split(" ").map { it.toInt() }
    val map = Array(y) { readln().split(" ").map { it.toLong() } }
    val stealth = readln().toLong()

    val dp = Array(y) { LongArray(x) }

    dp[0][0] = map[0][0]

    for (j in 1 until x) {
        dp[0][j] = dp[0][j - 1] + map[0][j]
    }

    for (i in 1 until y) {
        dp[i][0] = dp[i - 1][0] + map[i][0]
    }

    for (i in 1 until y) {
        for (j in 1 until x) {
            dp[i][j] = map[i][j] + minOf(dp[i - 1][j], dp[i][j - 1])
        }
    }

    val sense = dp[y - 1][x - 1]
    print(if (stealth >= sense) "YES\n$sense" else "NO")
}