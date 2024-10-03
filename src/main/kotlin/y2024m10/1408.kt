package y2024m10

fun main() {
    val a = readln().split(":").map { it.toInt() }
    val b = readln().split(":").map { it.toInt() }

    val aSum = timeSum(a)
    val bSum = timeSum(b)

    val ans = if (aSum < bSum) {
        toTime(bSum - aSum)
    } else {
        toTime(24 * 60 * 60 - (aSum - bSum))
    }

    print(String.format("%02d:%02d:%02d", ans.first, ans.second, ans.third))
}

private fun timeSum(time: List<Int>): Int {
    return (time[0] * 3600) + (time[1] * 60) + time[2]
}

private fun toTime(sum: Int): Triple<Int, Int, Int> {
    var tmp = sum
    val h = tmp / 3600
    tmp %= 3600
    val m = tmp / 60
    tmp %= 60
    val s = tmp

    return Triple(h, m, s)
}