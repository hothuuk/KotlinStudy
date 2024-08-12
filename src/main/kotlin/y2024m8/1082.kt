package y2024m8

import java.math.BigInteger

fun main() {
    val n = readln().toInt()
    val prices = readln().split(" ").map { it.toInt() }.toIntArray()
    val money = readln().toInt()

    val dp = Array(51) { mutableListOf<Long> () }

    for (i in 0 until n) {
        val price = prices[i]
        if (dp[price].isEmpty() || dp[price][0] < i) {
            dp[price].clear()
            dp[price].add(i.toLong())
        }
    }

    for (price in prices) {
        for (i in 0 .. money) {
            if (dp[i].isEmpty() || i + price > money) continue

            val arr = dp[i] + dp[price]

            if (dp[i + price].isEmpty()) {
                dp[i + price].addAll(arr)
            } else {
                dp[i + price] = compare(dp[i + price], arr)
            }
        }
    }

    var maxRoomNum = BigInteger.ZERO

    for (i in 0 .. money) {
        if (dp[i].isNotEmpty()) {
            val roomNum = sum(dp[i])

            if (maxRoomNum < roomNum) {
                maxRoomNum = roomNum
            }
        }
    }

    print(maxRoomNum)
}

private fun compare(arr1: List<Long>, arr2: List<Long>): MutableList<Long> {
    return if (sum(arr1) >= sum(arr2)) arr1.toMutableList() else arr2.toMutableList()
}

private fun sum(arr: List<Long>): BigInteger {
    return arr.sortedDescending()
        .fold(BigInteger.ZERO) { acc, n ->
            acc.multiply(BigInteger.TEN).add(BigInteger.valueOf(n))
        }
}
