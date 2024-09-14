package y2024m9

fun main() {
    val n = readln().toInt()
    val dp = mutableListOf<Int>()

    dp.add(0)
    dp.add(1)
    dp.add(3)

    for (i in 3 .. n) {
        dp.add(((dp[i - 2] * 2) + dp[i - 1]) % 10007)
    }

    print(dp[n])
}