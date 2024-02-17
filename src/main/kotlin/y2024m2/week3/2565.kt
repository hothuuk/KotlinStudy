package y2024m2.week3

import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val arr = Array(n) { Array(2) {0} }
    val dp = Array(n) {1}

    repeat(n) { i ->
        val (a, b) = readln().split(" ").map { it.toInt() }
        arr[i][0] = a
        arr[i][1] = b
    }

    arr.sortWith { a, b ->
        a[0] - b[0]
    }

    for(i in 1 until n) {
        for(j in 0 until i) {
            if (arr[i][1] > arr[j][1]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }

    println(n - dp.maxOrNull()!!)
}