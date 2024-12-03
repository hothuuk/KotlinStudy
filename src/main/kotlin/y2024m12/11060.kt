package y2024m12

fun main() {
    val n = readln().toInt()
    val jumps = readln().split(" ").map { it.toInt() }
    val dp = IntArray(n) { Int.MAX_VALUE }
    dp[0] = 0

    if (n == 1) {
        print(0)
        return
    }

    for (i in 0 until n) {
        if (dp[i] != Int.MAX_VALUE) {
            for (j in 1..jumps[i]) {
                if (i + j < n) {
                    dp[i + j] = minOf(dp[i + j], dp[i] + 1)
                }
            }
        }
    }

    print(if (dp[n - 1] == Int.MAX_VALUE) -1 else dp[n - 1])
}