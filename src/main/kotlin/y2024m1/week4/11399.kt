package y2024m1.week4

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ")
    val arr2 = ArrayList<Int>()
    val time = IntArray(n + 1)

    repeat(n) {
        arr2.add(arr[it].toInt())
    }

    arr2.sort()

    for (i in 1 until n + 1) {
        time[i] = time[i - 1] + arr2[i - 1]
    }

    print(time.sum())
}