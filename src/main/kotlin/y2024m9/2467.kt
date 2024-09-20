package y2024m9

import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val sols = readln().split(" ").map { it.toInt() }
    var ans = 0 to 0

    var l = 0
    var r = n - 1
    var min = Integer.MAX_VALUE

    while (l != r) {
        if (abs(sols[l] + sols[r]) < min) {
            ans = sols[l] to sols[r]
            min = abs(sols[l] + sols[r])

            if (min == 0) break
        }

        if (abs(sols[l]) < abs(sols[r])) {
            r--
        } else {
            l++
        }
    }

    print("${ans.first} ${ans.second}")
}