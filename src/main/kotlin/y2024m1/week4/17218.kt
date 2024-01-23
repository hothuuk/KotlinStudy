package y2024m1.week4

fun main() {
    val str1 = readln()
    val str2 = readln()

    val n = str1.length
    val m = str2.length

    val dp = Array(n + 1) { IntArray(m + 1) }

    for (i in 1 .. n) {
        for (j in 1 .. m) {
            if (str1[i - 1] == str2[j - 1]) {
                dp[i][j] = dp[i - 1][j -1] + 1
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    fun back(str1: String, str2: String, n: Int, m: Int): String {
        if (n == 0 || m == 0) return ""
        else if (str1[n - 1] == str2[m - 1]) return back(str1, str2, n - 1, m - 1)  + str1[n - 1]

        if (dp[n][m - 1] >= dp[n - 1][m]) return back(str1, str2, n, m - 1)
        else return back(str1, str2, n - 1, m)
    }

    print(back(str1, str2, n, m))
}