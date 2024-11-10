package y2024m11

fun main() {
    val n = readln().toInt()
    val nums = IntArray(n)
    val m = n / 2

    for(i in 1 .. n) {
        val a = i / 2
        nums[i - 1] = if (i % 2 != 0) m + a + 1 else m - a + 1
    }

    print(nums.joinToString(" "))
}