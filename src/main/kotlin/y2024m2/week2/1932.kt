package y2024m2.week2

import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val dp = ArrayList<IntArray>()

    for (i in 0 until  n) {
        dp.add(readln().split(" ").map { it.toInt() }.toIntArray())
    }

    for(i in 1 until n){
        for(j in 0 .. i){
            when(j){
                0 -> {
                    dp[i][j] += dp[i-1][0]
                }
                i -> {
                    dp[i][j] += dp[i-1][j-1]
                }
                else -> {
                    dp[i][j] += max(dp[i-1][j-1],dp[i-1][j])
                }
            }
        }
    }

    println(dp[n-1].max())
}