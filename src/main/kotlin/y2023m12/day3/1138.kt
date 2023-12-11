package y2023m12.day3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val arr = IntArray(size)
    val answer = IntArray(size)
    val visited = BooleanArray(size)

    for (i in 0 until size) {
        arr[i] = scanner.nextInt()
    }

    for (i in 0 until size) {
        val num = arr[i]
        var cnt = 0

        val index = (0 until size).indexOfFirst { !visited[it] && cnt++ == num }

        if (index != -1) {
            visited[index] = true
            answer[index] = i + 1
        }
    }

    for (i in 0 until size) {
        print("${answer[i]} ")
    }
}
