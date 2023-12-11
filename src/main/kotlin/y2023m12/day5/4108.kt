package y2023m12.day5

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var x: Int
    var y: Int

    while (true) {
        y = sc.nextInt()
        x = sc.nextInt()
        sc.nextLine()

        if (x == 0 && y == 0) {
            break
        }

        val arr = Array(y) { Array(x) { '.' } }
        val answer = Array(y) { IntArray(x) }

        for (i in 0 until y) {
            val line = sc.nextLine()
            for (j in 0 until x) {
                arr[i][j] = line[j]
            }
        }

        calculateMineCounts(arr, answer, x, y)

        printResult(arr, answer, x, y)

    }
}

fun calculateMineCounts(arr: Array<Array<Char>>, answer: Array<IntArray>, x: Int, y: Int) {
    val directions = arrayOf(-1, 0, 1)

    for (i in 0 until y) {
        for (j in 0 until x) {
            if (arr[i][j] == '*') continue

            for (dx in directions) {
                for (dy in directions) {
                    if (dx == 0 && dy == 0) continue
                    val nx = i + dx
                    val ny = j + dy

                    if (nx in 0 until y && ny in 0 until x && arr[nx][ny] == '*') {
                        answer[i][j]++
                    }
                }
            }
        }
    }
}

fun printResult(arr: Array<Array<Char>>, answer: Array<IntArray>, x: Int, y: Int) {
    for (i in 0 until y) {
        for (j in 0 until x) {
            if (arr[i][j] == '*') {
                print(arr[i][j])
            } else {
                print(answer[i][j])
            }
        }
        println()
    }
}
