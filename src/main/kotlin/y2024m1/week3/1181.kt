package y2024m1.week3

fun main() {
    val n = readln().toInt()
    val arr = Array(n) {""}

    repeat(n) {
        val str = readln()
        if (!arr.contains(str)) arr[it] = str
    }

    arr.sortWith(compareBy({it.length}, {it}))

    arr.forEach {
        if (it != "") println(it)
    }
}