package y2024m11

fun main() {
    val times = Array(4) { readln().toInt() }
    val sum = times.sum()
    println(sum / 60)
    print(sum % 60)
}