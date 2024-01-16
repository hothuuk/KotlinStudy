package y2024m1.week3

fun main() {
    var n = readln().toInt()
    var cnt = 0


    while (n > 0) {
        if (n == 1) {
            print("-1")
            return
        }

        if (n % 5 == 0) {
            cnt += n / 5
            break
        } else {
            n -= 2
            cnt++
        }
    }

    print(cnt)
}