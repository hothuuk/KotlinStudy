package y2024m1.week2

fun main() {
    val a = readln()
    val b = readln()

    var n = ""

    for (i in 0 until 8) {
        n += a[i]
        n += b[i]
    }

    while (n.length != 2) {
        var m = ""
        for (i in 0 until n.length - 1) {
            val sum = (n[i] - '0') + (n[i + 1] - '0')
            m += if (sum >= 10) {
                (sum - 10).toString()
            } else sum.toString()
        }
        n = m
    }

    print(n)
}