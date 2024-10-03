package y2024m10

fun main() {
    val p = Array(101) { IntArray(101) }

    repeat(readln().toInt()) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        for (i in y until y + 10) {
            for (j in x until x + 10) {
                p[i][j] = 1
            }
        }
    }

    print(p.sumOf { it.sum() })
}