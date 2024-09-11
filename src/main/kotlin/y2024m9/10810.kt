package y2024m9

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val bucket = IntArray(n + 1)

    repeat(m) {
        val (l, r, num) = readln().split(" ").map { it.toInt() }

        for (i in l .. r) {
            bucket[i] = num
        }
    }

    print(bucket.drop(1).joinToString(" "))
}