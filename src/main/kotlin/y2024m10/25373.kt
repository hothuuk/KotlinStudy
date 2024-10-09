package y2024m10

fun main() {
    val n = readln().toLong()
    val ans = when {
        n <= 1 -> 1
        n <= 3 -> 2
        n <= 6 -> 3
        n <= 10 -> 4
        n <= 15 -> 5
        n <= 21 -> 6
        else -> {
            val check = (n - 21) % 7
            ((n - 21) / 7) + 6 + if (check > 0) 1 else 0
        }
    }

    print(ans)
}