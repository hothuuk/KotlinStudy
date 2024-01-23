package y2024m1.week4

fun main() {
    val n = readln().toInt()
    val arr = DoubleArray(n)

    if (n == 0) {
        print(0)
        return
    }

    repeat(n) {
        arr[it] = readln().toDouble()
    }

    arr.sort()

    val m = Math.round(n.toDouble() * 0.15).toInt()
    var sum = 0.0

    for (i in m until n - m) {
        sum += arr[i]
    }

    print(Math.round(sum / (n - m * 2)).toInt())
}