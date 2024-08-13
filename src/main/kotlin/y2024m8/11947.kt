package y2024m8

import java.math.BigInteger

fun main() {
    val n = readln().toInt()

    repeat(n) {
        var num = readln().toLong()
        val firstNum = num.toString()[0].toString().toInt()

        if (firstNum >= 5) {
            num = change(num)
        }

        val reversedNum = reverse(num)
        val answer = BigInteger.valueOf(num).multiply(BigInteger.valueOf(reversedNum))

        println(answer)
    }
}

private fun reverse(num: Long): Long {
    val strNum = num.toString()
    var str = ""

    for (ch in strNum) {
        str += ('9'.code - ch.code)
    }

    return str.toLong()
}

private fun change(n: Long): Long {
    val length = n.toString().length - 1
    var str = "5"

    repeat(length) {
        str += "0"
    }

    return str.toLong()
}