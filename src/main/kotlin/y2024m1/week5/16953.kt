package y2024m1.week5

fun main() {
    var (n, m) = readln().split(" ").map { it.toInt() }

    var cnt = 1

    while (n != m) {

        if (n > m) {
            print(-1)
            return
        }

        if (m % 10 == 1) {
            m /= 10
        } else if (m % 2 == 0) {
            m /= 2
        } else {
            print(-1)
            return
        }

        cnt++
    }

    print(cnt)
}