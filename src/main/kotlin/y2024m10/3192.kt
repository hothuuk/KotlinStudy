package y2024m10

fun main() {
    val ms = Array(3) { readln().split(" ").map { it.toInt() }.toTypedArray() }
    val sum = findSum(ms)
    fillBlank(ms, sum)
    ms.map { println(it.joinToString(" ")) }
}

private fun findSum(ms: Array<Array<Int>>): Int {
    var sum = -1

    for (i in 0 until 3) {
        sum = maxOf(sum, maxOf(ms[i][0] + ms[i][1] + ms[i][2], ms[0][i] + ms[1][i] + ms[2][i]))
    }

    val ds = listOf(ms[0][0] + ms[1][1] + ms[2][2], ms[0][2] + ms[1][1] + ms[2][0])

    sum = if (ds.min() == 0) {
        val ns = ms.sumOf { it.sum() }
        ns / 2
    } else {
        maxOf(sum, ds.max())
    }

    return sum
}

private fun fillBlank(ms: Array<Array<Int>>, sum: Int) {
    val index = listOf(
        1 to 2,
        0 to 2,
        0 to 1
    )

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (ms[i][j] == 0) {
                val (a1, b1) = index[i]
                val (a2, b2) = index[j]

                if (ms[a1][j] * ms[b1][j] != 0) {
                    ms[i][j] = sum - (ms[a1][j] + ms[b1][j])
                } else if (ms[i][a2] * ms[i][b2] != 0) {
                    ms[i][j] = sum - (ms[i][a2] + ms[i][b2])
                }
            }
        }
    }
}