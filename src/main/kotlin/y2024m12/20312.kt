package y2024m12

fun main() {
    val n = readln().toInt()
    val cpu = readln().split(" ").map { it.toLong() }
    val dp = LongArray(n)
    val mod = 1_000_000_007L
    var sum = 0L

    for (i in 1 until n) {
        dp[i] = (dp[i - 1] + 1) * cpu[i - 1] % mod
        sum = (sum + dp[i]) % mod
    }

    print(sum)
}
