package y2024m9

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val hands = Array(n) { readln().split(" ").map { it.toInt() } }
    val stretches = Array(n) { 0 }

    for (i in 0 until m) {
        for (j in 0 until n) {
            stretches[j] += hands[j][i]

            if (stretches[j] >= k) {
                print("${j + 1} ${i + 1}")
                return
            }
        }
    }
}