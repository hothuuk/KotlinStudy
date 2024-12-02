package y2024m12

import kotlin.math.sqrt

fun main() {
    val k = readln().toInt()
    val prime = createPrime()
    val nums = ArrayList<Int>()

    for (i in 2 until prime.size) {
        if (!prime[i]) {
            nums.add(i)
        }
    }

    print(nums[k - 1])
}

private fun createPrime(): BooleanArray {
    val prime = BooleanArray(8000002)
    prime[0] = true
    prime[1] = true

    for (i in 2 .. sqrt(prime.size.toDouble()).toInt()) {
        if (prime[i]) continue

        for (j in i * i until prime.size step i) {
            prime[j] = true
        }
    }

    return prime
}