package y2024m1.week4

fun main() {
    readln().split(" ").map{ it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val map = HashMap<Int, Int> ()

    nums.forEach { map[it] = (map[it]?:0).plus(1) }

    val fre = compareBy<Int> { map[it] }.reversed()
    val index = fre.thenBy { nums.indexOf(it) }

    print(nums.sortedWith(index).joinToString(" "))
}