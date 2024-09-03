package y2024m9

fun main() {
    val n = readln().toInt()
    val nums = Array(n + 1) { 0.0 }
    val dp = Array(n + 1) { 0.0 }

    for (i in 1 .. n) {
        nums[i] = readln().toDouble()
        dp[i] = maxOf(nums[i], nums[i] * dp[i - 1])
    }

    print(String.format("%.3f", dp.max()))
}