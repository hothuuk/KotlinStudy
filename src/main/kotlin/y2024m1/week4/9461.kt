package y2024m1.week4

fun main() {
    val t = readln().toInt()
    val dp = LongArray(101)

    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2

    for (i in 5 .. 100) {
        dp[i] = dp[i - 1] + dp[i - 5]
    }

    repeat(t) {
        println(dp[readln().toInt()])
    }
}