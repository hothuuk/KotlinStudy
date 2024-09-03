package y2024m9

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    var minPack = 1001
    var minEach = 1001

    repeat(m) {
        val (p, e) = readln().split(" ").map { it.toInt() }
        minPack = minOf(minPack, p)
        minEach = minOf(minEach, e)
    }

    print(minOf(minPack * (n / 6) + minEach * (n % 6), minPack * ((n / 6) + 1), minEach * n))
}