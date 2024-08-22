package y2024m8

fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map { it.toInt() }
    val search = readln().toInt()

    val map = input.groupingBy { it }.eachCount()

    print(map.getOrDefault(search, 0))
}