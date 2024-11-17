package y2024m11

fun main() {
    val nums = Array(5) { readln().toInt() }
    val max = maxOf(nums[1] / nums[3] + if (nums[1] % nums[3] == 0) 0 else 1, nums[2] / nums[4] + if (nums[2] % nums[4] == 0) 0 else 1)
    print(nums[0] - max)
}