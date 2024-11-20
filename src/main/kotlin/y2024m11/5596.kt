package y2024m11

fun main() {
    val sum1 = sum()
    val sum2 = sum()
    print(maxOf(sum1, sum2))
}

private fun sum(): Int {
    return readln().split(" ").sumOf { it.toInt() }
}