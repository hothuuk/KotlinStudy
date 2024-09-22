package y2024m9

private val map = HashMap<Long, Long>()

fun main() {
    val (n, p, q) = readln().split(" ").map { it.toLong() }
    print(solve(n, p, q))
}

private fun solve(n: Long, p: Long, q: Long): Long {
    if (n == 0L) {
        return 1
    }

    if (map.containsKey(n)) {
        return map[n]!!
    }

    map[n] = solve(n / p, p, q) + solve(n / q, p, q)
    return map[n]!!
}