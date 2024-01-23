package y2024m1.week4

data class Data(val scr: Double, val ch: String)
val table = ArrayList<Data> ()

fun main() {
    val (n, score) = readln().split(" ").map { it.toDouble() }
    val scores = Array(n.toInt()) { Array(2) {0.0} }

    setTable()

    repeat(n.toInt() - 1) { c ->
        val (a, b) = readln().split(" ").map { it }
        scores[c][0] = a.toDouble()
        scores[c][1] = search(b)
    }

    val m = readln().toDouble()
    var sum = m
    var sum1 = 0.0

    repeat(n.toInt() - 1) {
        sum += scores[it][0]
        sum1 += scores[it][0] * scores[it][1]
    }

    for (i in table.indices) {
        val a = ((((sum1 + m * table[i].scr) / sum) * 10) * 10).toInt()
        val b = a.toDouble() / 100

        if (b > score) {
            print(table[i].ch)
            return
        }
    }

    print("impossible")
}

fun search(ch: String): Double {
    for (i in table.indices) {
        if (table[i].ch == ch) return table[i].scr
    }

    return -1.0
}

fun setTable() {
    table.add(Data(0.0, "F"))
    table.add(Data(1.0, "D0"))
    table.add(Data(1.5, "D+"))
    table.add(Data(2.0, "C0"))
    table.add(Data(2.5, "C+"))
    table.add(Data(3.0, "B0"))
    table.add(Data(3.5, "B+"))
    table.add(Data(4.0, "A0"))
    table.add(Data(4.5, "A+"))
}