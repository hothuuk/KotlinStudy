package y2024m1.week3

fun main() {
    var n = readln().toInt()
    var cnt = 0

    while (true) {
        if (n % 5 == 0) {
            print(n / 5 + cnt)
            return
        } else if (n <= 0) {
            print(-1)
            return
        }

        n -= 3
        cnt++
    }
}