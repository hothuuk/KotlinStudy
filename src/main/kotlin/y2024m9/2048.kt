package y2024m9

import kotlin.math.pow

fun main() {
    var t = readln().toInt()
    val sb = StringBuilder()

    while (t-- > 0) {
        val (l, r) = readln().split(" ").map { it.toInt() }

        if (r >= 4) {
            sb.append(r).append("\n")
            continue
        }

        var str = ""

        for (i in l .. r) {
            str += (2.0).pow(i).toInt()
        }

        var n = str.toInt()
        var cnt = 0

        while (n % 2 == 0) {
            n /= 2
            cnt++
        }

        sb.append(cnt).append("\n")
    }

    print(sb)
}