package y2024m1.week2

fun main() {
    val t = readln().toInt()
    val arr = Array(t) {""}

    for (i in 0 until t) {
        val n = readln().toInt()
        var sum = 0
        var chk = true

        for (j in 1 until n) {
            if (n % j == 0) sum += j
        }

        if (sum <= n) {
            arr[i] = "BOJ 2022"
            continue
        }

        for (j in 1 until n) {
            sum = 0
            if (n % j == 0) {
                for (k in 1 until j) {
                    if (j % k == 0) sum += k
                }

                if (sum > j) {
                    arr[i] = "BOJ 2022"
                    chk = false
                }
            }
        }

        if (chk) arr[i] = "Good Bye"
    }

    for (i in 0 until t) {
        println(arr[i])
    }
}