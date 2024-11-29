package y2024m11

fun main() {
    val nums = Array(5) { readln().toInt() }
    nums.sort()

    println(nums.sum() / 5)
    print(nums[2])
}