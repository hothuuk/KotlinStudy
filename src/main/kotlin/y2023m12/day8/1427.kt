package y2023m12.day8

fun main() {
    var n = readln().toInt()
    val len = n.toString().length
    val arr = IntArray(len) {0}

    for (i in 0 until len) {
        arr[i] = n % 10
        n /= 10
    }

    arr.sortDescending()
    print(arr.joinToString(""))
}