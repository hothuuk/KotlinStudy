package y2024m1.week4

data class Cow(val come: Int, val out: Int)

fun main() {
    val n = readln().toInt()

    val time = ArrayList<Cow> ()
    var endTime = 0

    for (i in 0 until n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        time.add(Cow(a, b))
    }

    time.sortWith(compareBy<Cow> {it.come}.thenBy { it.out })

    for (i in 0 until n) {
        if (endTime < time[i].come) {
            endTime = time[i].come + time[i].out
        } else {
            endTime += time[i].out
        }
    }

    print(endTime)
}