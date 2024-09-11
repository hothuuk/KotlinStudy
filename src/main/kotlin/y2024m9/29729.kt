package y2024m9

fun main() {
    var (s, n, m) = readln().split(" ").map { it.toInt() }
    var c = 0

    repeat(n + m) {
        val input = readln().toInt()
        if (input == 1) c++ else c--
        if (c > s) s *= 2
    }

    print(s)
}