package y2024m1.week3

fun main() {
    val n = readln().toInt()
    val m = readln().toInt()

    val arr = readln().split(" ")
    var cnt = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[j].toInt() + arr[i].toInt() == m) {
                cnt++
                break
            }
        }
    }

    print(cnt)
}