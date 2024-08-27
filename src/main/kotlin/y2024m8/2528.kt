package y2024m8

import kotlin.math.max

private data class Stick (var left: Int, var right: Int, var dir: Int)

fun main() {
    val (N, L) = readln().split(" ").map { it.toInt() }
    val floor = Array(N + 1) { Stick(-1, -1, -1) }

    for (i in 1 .. N) {
        val input = readln().trimEnd()
        val (l, d) = input.split(" ").map { it.toInt() }
        floor[i] = if (d == 0) Stick(1, l, d) else Stick(L - l + 1, L, d)
    }

    var time = 0

    for (i in 1 until N) {
        val curStick = floor[i]
        val nextStick = floor[i + 1]

        if (curStick.dir == nextStick.dir) continue

        if (curStick.dir == 0) {
            time = max(time, (nextStick.left - curStick.right - 1) / 2)
        } else {
            time = max(time, (curStick.left - nextStick.right - 1) / 2)
        }
    }

    print(time)
}