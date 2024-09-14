package y2024m9

import kotlin.math.sqrt

fun main() {
    val target = readln().toInt()
    val primes = createPrimes(target)
    var left = 0
    var right = 0
    var cnt = 0
    var sum = 2

    while (right < primes.size) {
        if (sum == target) {
            cnt++

            if (left < right) {
                sum -= primes[left++]
            } else {
                right++
                if (right < primes.size) {
                    sum += primes[right]
                }
            }
        } else if (sum > target) {
            sum -= primes[left++]
        } else {
            right++
            if (right < primes.size) {
                sum += primes[right]
            }
        }
    }

    print(cnt)
}

private fun createPrimes(limit: Int): List<Int> {
    val isPrime = BooleanArray(limit + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2 .. sqrt(limit.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in (i * i) .. limit step i) {
                isPrime[j] = false
            }
        }
    }

    return (2 .. limit).filter { isPrime[it] }
}