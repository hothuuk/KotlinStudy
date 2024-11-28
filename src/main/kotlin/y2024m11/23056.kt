package y2024m11

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val fcfs = IntArray(n + 1)
    val groups = mutableListOf<Pair<Int, String>>()

    while (true) {
        val (g, name) = readln().split(" ")
        val grade = g.toInt()

        if (grade == 0) break

        if (fcfs[grade] < m) {
            groups.add(grade to name)
            fcfs[grade]++
        }
    }

    val (odd, even) = groups.partition { it.first % 2 != 0 }

    val result = buildString {
        appendLine(odd.sortedOutput())
        appendLine(even.sortedOutput())
    }.trim()

    print(result)
}

private fun List<Pair<Int, String>>.sortedOutput(): String {
    return sortedWith(compareBy({ it.first }, { it.second.length }, { it.second }))
        .joinToString("\n") { "${it.first} ${it.second}" }
}
