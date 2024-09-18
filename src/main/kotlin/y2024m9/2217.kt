package y2024m9

fun main() {
    val s = readln().toInt()
    val nums = Array(s) { readln().toInt() }
    nums.sort()

    var max = 0

    for (i in 0 until s) {
        max = maxOf(max, nums[i] * (s - i))
    }

    print(max)
}