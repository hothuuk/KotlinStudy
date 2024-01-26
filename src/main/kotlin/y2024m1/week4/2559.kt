package y2024m1.week4

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    val arr = readln().split(" ")
    val temp = IntArray(n)

    repeat(n) {
        temp[it] = arr[it].toInt()
    }

    var start = 0
    var end = k - 1
    var max = Int.MIN_VALUE

    while(end != n) {
        var sum = 0

        for (i in start .. end) {
            sum += temp[i]
        }

        if (sum > max) max = sum

        start++
        end++
    }

    print(max)
}