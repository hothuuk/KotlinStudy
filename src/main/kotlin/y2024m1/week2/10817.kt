package y2024m1.week2

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val arr = Array(3) {0}

    repeat(3) {
        arr[it] = nextInt()
    }

    arr.sort()

    print(arr[1])
}