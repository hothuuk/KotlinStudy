package y2024m1.week4

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val fnd = readln().toInt()

    var cnt = 0
    var head = 0
    var tail = n - 1

    val sortedNums: IntArray = nums.sorted().toIntArray()

    while (head < tail) {
        val sum = sortedNums[head] + sortedNums[tail]

        if (sum == fnd) {
            cnt++
            tail--
        } else if (sum < fnd) {
            head++
        } else {
            tail--
        }
    }

    print(cnt)
}