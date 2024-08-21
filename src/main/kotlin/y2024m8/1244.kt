package y2024m8

import kotlin.math.abs

fun main() {
    val switchN = readln().toInt()
    val switches = intArrayOf(0) + readln().split(" ").map { it.toInt() }.toIntArray()
    val studentN = readln().toInt()

    repeat(studentN) {
        val (s, n) = readln().split(" ").map { it.toInt() }

        if (s == 1) {
            for (i in n .. switchN step n) {
                switches[i] = abs(switches[i] - 1)
            }
        } else {
            var left = n
            var right = n

            while (left > 1 && right < switchN && switches[left - 1] == switches[right + 1]) {
                left--
                right++
            }

            for (i in left .. right) {
                switches[i] = abs(switches[i] - 1)
            }
        }
    }

    switches.drop(1).chunked(20).forEach { chunk ->
        println(chunk.joinToString(" "))
    }
}
