package y2024m1.week2

import java.math.BigInteger
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val st = next()
    var sum = BigInteger.ZERO

    for (i in 0 until n) {
        sum = sum.add((st[i].code - 96).toBigInteger().multiply(BigInteger.valueOf(31).pow(i)))
    }

    print(sum.remainder(BigInteger.valueOf(1234567891)))
}