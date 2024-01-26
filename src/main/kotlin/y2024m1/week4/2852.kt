package y2024m1.week4

fun main() {
    val n = readln().toInt()
    val info = ArrayList<Pair<Int, Int>> ()

    repeat(n) {
        val (a, b) = readln().split(" ").map { it }
        val c = b.split(":")
        info.add(Pair(a.toInt(),(c[0].toInt() * 60) + c[1].toInt()))
    }

    var scoreA = 0
    var scoreB = 0
    var timeA = 0
    var timeB = 0
    var time = 0

    for (i in 0 until n) {
        if (scoreA > scoreB) {
            timeA += info[i].second - time
        } else if (scoreB > scoreA) {
            timeB += info[i].second - time
        }

        if (info[i].first == 1) scoreA++
        else scoreB++

        time = info[i].second
    }

    if (scoreA > scoreB) timeA += (48 * 60) - time
    else if (scoreB > scoreA) timeB += (48 * 60) - time

    println("${String.format("%02d", timeA / 60)}:${String.format("%02d", timeA % 60)}")
    println("${String.format("%02d", timeB / 60)}:${String.format("%02d", timeB % 60)}")
}