package y2024m1.week3

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ")
    val arr2 = IntArray(n + 1)
    repeat(n) {
        arr2[it + 1] = arr[it].toInt()
    }
    val sum = IntArray(n + 1)

    var cnt = 0

    for (i in 1..arr2.lastIndex) {
        sum[i] = sum[i - 1] + arr2[i]
    }

    for (i in 0 until n + 1) {
        for (j in i + 1 until n + 1) {
            if (sum[j] - sum[i] == m) {
                cnt++
                break
            }
        }
    }

    print(cnt)
}