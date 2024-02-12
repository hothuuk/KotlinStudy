package y2024m2.week3

fun main() {
    val (n, m, l) = readln().split(" ").map { it.toInt() }
    val people = IntArray(n)

    people[0] = 1

    var idx = 0
    var cnt = 0

    while (true) {

        if (people[idx] == m) break

        if (people[idx] % 2 == 0) {
            if (idx - l < 0) {
                idx = n + (idx - l)
            } else {
                idx -= l
            }
        } else {
            if (idx + l >= n) {
                idx = (idx + l) - n
            } else {
                idx += l
            }
        }

        people[idx]++
        cnt++
    }

    print(cnt)
}