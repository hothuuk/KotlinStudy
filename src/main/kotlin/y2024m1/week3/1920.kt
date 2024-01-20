package y2024m1.week3

fun main() {
    readln()
    val arr1 = readln().split(" ").sorted()
    readln()
    val arr2 = readln().split(" ").toMutableList()

    repeat(arr2.size) {
        arr2[it] = (if (arr1.binarySearch(arr2[it]) >= 0) 1
        else 0).toString()
    }

    arr2.forEach {
        println(it)
    }
}