package y2024m9

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }

    var left = 0
    var right = 0
    var sum = nums[0]
    var len = 1
    var answer = Int.MAX_VALUE

    while (right < n) {
        if (sum >= s) {
            answer = minOf(answer, len)

            if (left < right) {
                sum -= nums[left++]
                len--
            } else {
                right++
                if (right < n) {
                    sum += nums[right]
                    len++
                }
            }
        } else {
            right++
            if (right < n) {
                sum += nums[right]
                len++
            }
        }
    }

    print(if (answer == Int.MAX_VALUE) 0 else answer)
}