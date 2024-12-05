package y2024m12

fun main() {
    val (n, _) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val mul = HashSet<Int>()

    for (num in nums) {
        for (i in num .. n step num) {
            mul.add(i)
        }
    }

    print(mul.sum())
}