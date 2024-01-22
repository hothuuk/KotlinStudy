package y2024m1.week3

import java.math.BigInteger

fun main() {
    val n = readln().toInt()
    val answer = ArrayList<BigInteger> ()

    repeat(n) {
        val str = readln()
        var foundInt = ""

        for (ch in str) {
            if (ch - '0' in 0 .. 9) {
                foundInt += ch
            } else {
                if (foundInt != "") {
                    answer.add(foundInt.toBigInteger())
                    foundInt = ""
                }
            }
        }

        if (foundInt != "") answer.add(foundInt.toBigInteger())
    }

    answer.sort()

    answer.forEach { println(it) }
}