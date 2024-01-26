package y2024m1.week4

fun main() {

    while (true) {
        try {
            val n = readln().toInt()
            println(cal(n))
        } catch (e: Exception) {
            break
        }
    }
}

fun cal(n: Int): Int {

    var m = 1
    var num = 1
    var sum = 0

    while (true) {
        val mod = num % n
        sum += mod

        if (sum % n == 0) break

        m++
        num = mod * 10
    }

    return m
}