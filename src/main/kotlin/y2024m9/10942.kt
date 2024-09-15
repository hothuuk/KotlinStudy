package y2024m9

fun main() {
    val size = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val n = readln().toInt()
    val sb = StringBuilder()
    val dp = Array(size) { BooleanArray(size) }

    for (i in 0 until size) {
        dp[i][i] = true
    }

    for (i in 0 until size - 1) {
        if (nums[i] == nums[i + 1]) {
            dp[i][i + 1] = true
        }
    }

    for (l in 3 .. size) {
        for (i in 0 .. size - l) {
            val j = i + l - 1

            if (nums[i] == nums[j] && dp[i + 1][j - 1]) {
                dp[i][j] = true
            }
        }
    }

    repeat(n) {
        val (s, e) = readln().split(" ").map { it.toInt() - 1 }
        sb.append(if (dp[s][e]) 1 else 0).append("\n")
    }

    print(sb)
}