package y2023m12.day7

import java.util.Arrays

fun main() {
    val n = readln().toInt()
    val arr = Array(n) {' '}
    Arrays.fill(arr, 'a')
    print(arr.joinToString(""))
}