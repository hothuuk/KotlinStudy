package y2024m8

fun main() {
    val nums = Array(3) { "" }

    repeat(3) {
        nums[it] = readln()
    }

    println(nums[0].toInt() + nums[1].toInt() - nums[2].toInt())
    println((nums[0] + nums[1]).toInt() - nums[2].toInt())
}