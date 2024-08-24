package y2024m8

fun main() {
    val n = readln().toInt()

    var head = 1
    var tail = 1
    var sum = 1
    var cnt = 1

    while (head < n) {
        if (sum < n) {
            sum += ++head
        } else if (sum > n) {
            sum -= tail++
        } else {
            cnt++
            sum += ++head
        }
    }

    print(cnt)
}