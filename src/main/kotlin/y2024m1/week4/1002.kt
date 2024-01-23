package y2024m1.week4

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val loc = readln().split(" ").map { it.toDouble() }
        val dis = sqrt((loc[0] - loc[3]).pow(2) + (loc[1] - loc[4]).pow(2))

        if (dis == 0.0 && loc[2] == loc[5]) println(-1)
        else if (dis > loc[2] + loc[5] || dis < abs(loc[2] - loc[5]) || (dis == 0.0 && loc[2] != loc[5])) println(0)
        else if (dis == loc[2] + loc[5] || dis == abs(loc[2] - loc[5])) println(1)
        else if (dis < loc[2] + loc[5] || dis > abs(loc[2] - loc[5])) println(2)
    }
}