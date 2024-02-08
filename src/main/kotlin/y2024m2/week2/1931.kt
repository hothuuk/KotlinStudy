package y2024m2.week2

fun main() {
    val n = readln().toInt()
    val arr = Array(n) { IntArray(2) }

    repeat(n) {
        val (s, e) = readln().split(" ").map { it.toInt() }
        arr[it][0] = s
        arr[it][1] = e
    }

    arr.sortWith(compareBy<IntArray> { it[1] }.thenBy { it[0] })

    var time = arr[0][1]
    var cnt = 1

    for (i in 1 until n) {
        if (time <= arr[i][0]) {
            time = arr[i][1]
            cnt++
        }
    }

    print(cnt)
}