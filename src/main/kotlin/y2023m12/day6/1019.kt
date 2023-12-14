package y2023m12.day6

fun countDigits(x: Int, counts: IntArray, multiplier: Int) {
    var tempX = x
    while (tempX > 0) {
        counts[tempX % 10] += multiplier
        tempX /= 10
    }
}

fun main() {
    var n = readln().toInt()
    val digitCounts = IntArray(10)
    var multiplier = 1
    var start = 1

    while (start <= n) {
        while (n % 10 != 9 && start <= n) {
            countDigits(n, digitCounts, multiplier)
            n--
        }

        if (n < start) break

        while (start % 10 != 0 && start <= n) {
            countDigits(start, digitCounts, multiplier)
            start++
        }
        start /= 10
        n /= 10

        for (i in digitCounts.indices) {
            digitCounts[i] += (n - start + 1) * multiplier
        }
        multiplier *= 10
    }

    println(digitCounts.joinToString(" "))
}

