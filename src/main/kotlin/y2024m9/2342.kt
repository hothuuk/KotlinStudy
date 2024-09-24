package y2024m9

fun main() {
    val inputs = readln().split(" ").map { it.toInt() }
    val moves = listOf(
        listOf(2, 2, 2, 2), // 중앙
        listOf(1, 3, 4, 3), // 위
        listOf(3, 1, 3, 4), // 왼
        listOf(4, 3, 1, 3), // 아
        listOf(3, 4, 3, 1), // 오
    )

    val dp = Array(5) { IntArray(5) { Int.MAX_VALUE } }
    dp[0][0] = 0

    for (next in inputs) {
        if (next == 0) break

        val tdp = Array(5) { IntArray(5) { Int.MAX_VALUE } }

        for (l in 0 .. 4) {
            for (r in 0 .. 4) {
                if (dp[l][r] == Int.MAX_VALUE) continue

                tdp[next][r] = minOf(tdp[next][r], dp[l][r] + moves[l][next - 1])
                tdp[l][next] = minOf(tdp[l][next], dp[l][r] + moves[r][next - 1])
            }
        }

        for (i in 0..4) {
            for (j in 0..4) {
                dp[i][j] = tdp[i][j]
            }
        }
    }

    var min = Int.MAX_VALUE

    for (l in 0 .. 4) {
        for (r in 0 .. 4) {
            min = minOf(min, dp[l][r])
        }
    }

    print(min)
}