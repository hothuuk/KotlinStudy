package y2024m1.week4

import kotlin.math.sqrt

fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }
    val prime = BooleanArray(m + 1)
    prime[1] = true

    for (i in 2 .. sqrt(m.toDouble()).toInt()) {
        if (prime[i]) continue

        for (j in i * i .. m step i) {
            prime[j] = true
        }
    }

    val answer = ArrayList<Int> ()

    for (i in n .. m) {
        if (!prime[i]) {
            answer.add(i)
        }
    }

    answer.forEach { println(it) }
}