package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val h = nextInt()
    val w = nextInt()
    val map = Array(h) {Array(w) {' '} }
    val answer = Array(h) {Array(w) {-1} }

    for (i in 0 until h) {
        val str = next()
        for (j in 0 until w) {
            map[i][j] = str[j]
        }
    }

    for (i in 0 until w) {

        for (y in 0 until h) {
            for (x in 0 until w) {
                if (map[y][x] == 'c' && answer[y][x] == -1) answer[y][x] = i
            }
        }

        for (y in 0 until h) {
            for (x in w - 1 downTo  0) {
                if (map[y][x] == 'c' && x + 1 < w) {
                    if (x + 1 < w) {
                        map[y][x + 1] = 'c'
                        map[y][x] = '.'
                    } else {
                        map[y][x] ='.'
                    }
                }
            }
        }
    }

    for (y in 0 until h) {
        for (x in 0 until w) {
            print("${answer[y][x]} ")
        }
        println()
    }
}