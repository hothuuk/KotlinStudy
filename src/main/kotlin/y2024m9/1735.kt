package y2024m9

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val (c, d) = readln().split(" ").map { it.toInt() }

    var n = b * d
    var m = (a * d) + (c * b)

    while (gcd(n, m) != 1) {
        val gcd = gcd(n, m)
        n /= gcd
        m /= gcd
    }

    print("$m $n")
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}