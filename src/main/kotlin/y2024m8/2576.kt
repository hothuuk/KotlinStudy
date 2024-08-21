package y2024m8

fun main() {
    val nums = ArrayList<Int>()
    var n: Int

    repeat(7) {
        n = readln().toInt()

        if (n % 2 == 1) {
            nums.add(n)
        }
    }

    if (nums.isEmpty()) {
        print(-1)
        return
    }

    println(nums.sum())
    println(nums.min())
}