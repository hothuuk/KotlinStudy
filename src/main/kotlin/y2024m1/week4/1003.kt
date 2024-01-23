package y2024m1.week4

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val m = readln().toInt()
        println("${fibonacci(m - 1)} ${fibonacci(m)}")
    }
}

fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1
    var tmp: Int

    for (i in 2 .. n) {
        tmp = a
        a = b
        b += tmp
    }

    return b
}