package y2024m1.week5

import kotlin.math.min

fun main() {
    var n = readln().toInt()

    while(n --> 0) {
        val m = readln().toInt()
        val mbti = readln().split(" ")

        if (m > 16 * 16) {
            println(0)
            continue
        }

        var min = Int.MAX_VALUE

        for (i in 0 until m - 2) {
            for (j in i + 1 until m - 1) {
                for (k in j + 1 until m) {
                    min = min(min, dist(mbti[i], mbti[j]) + dist(mbti[j], mbti[k]) +dist(mbti[i], mbti[k]))
                }
            }
        }

        println(min)
    }
}

fun dist(s1: String, s2: String): Int {
    var cnt = 0

    for (i in 0 until 4) {
        if (s1[i] != s2[i]) cnt++
    }

    return cnt
}