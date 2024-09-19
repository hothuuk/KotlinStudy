package y2024m9

fun main() {
    val (r, c, q) = readToSplit()
    val totalSum = Array(r + 1) { IntArray(c + 1) }

    for (y in 1 .. r) {
        val input = readToSplit()

        for (x in 1 .. c) {
            totalSum[y][x] = input[x - 1] + totalSum[y - 1][x] + totalSum[y][x - 1] - totalSum[y - 1][x - 1]
        }
    }

    val sb = StringBuilder()

    repeat(q) {
        val(r1, c1, r2, c2) = readToSplit()
        val sum = totalSum[r2][c2] - totalSum[r1 - 1][c2] - totalSum[r2][c1 - 1] + totalSum[r1 - 1][c1 - 1]
        val cnt = (r2 - r1 + 1) * (c2 - c1 + 1)
        sb.append(sum / cnt).append("\n")
    }

    print(sb)
}

private fun readToSplit(): List<Int> {
    return readln().split(" ").map { it.toInt() }
}