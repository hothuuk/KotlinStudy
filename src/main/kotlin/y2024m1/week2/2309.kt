package y2024m1.week2

fun main() {
    val arr = Array(9) {0}

    for (i in 0 until 9) {
        arr[i] = readln().toInt()
    }

    arr.sort()

    val sum = arr.sum()

    var a = -1
    var b = -1
    var finsh = false

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (i == j) continue

            val n = sum - arr[i] - arr[j]

            if (n == 100) {
                a = i
                b = j
                finsh = true
                break
            }
        }
        if (finsh) break
    }

    repeat(9) { if (it != a && it != b) println(arr[it]) }
}