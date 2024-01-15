package y2024m1.week2

fun main() {

    val arr = Array(26) {-1}

    val str = readln()

    for (i in str.indices) {
        val asc = str[i].code - 97
        if (arr[asc] == -1) {
            arr[asc] = i
        }
    }

    for (i in arr.indices) {
        print("${arr[i]} ")
    }
}