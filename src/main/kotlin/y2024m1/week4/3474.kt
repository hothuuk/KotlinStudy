package y2024m1.week4

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        var cnt = 0
        var i = 5

        while (i <= n) {
            cnt += n / i
            i *= 5
        }

        println(cnt)
    }
}