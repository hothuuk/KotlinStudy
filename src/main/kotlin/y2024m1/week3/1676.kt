package y2024m1.week3

fun main() {
    var n = readln().toInt()
    var cnt = 0

    while (n >= 5) {
        cnt += n / 5
        n /= 5
    }

    print(cnt)
}