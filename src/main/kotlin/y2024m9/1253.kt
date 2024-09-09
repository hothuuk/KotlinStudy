package y2024m9

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }.sorted()

    var cnt = 0

    for (i in 0 until n) {
        var left = 0
        var right = n - 1

        while (left < right) {
            if (left == i || right == i) {
                if (left == i) left++
                else right--
                continue
            }

            val sum = nums[left] + nums[right]

            if (sum == nums[i]) {
                cnt++
                break
            } else if (sum > nums[i]) {
                right--
            } else {
                left++
            }
        }
    }

    print(cnt)
}