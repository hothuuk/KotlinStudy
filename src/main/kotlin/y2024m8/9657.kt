package y2024m8

fun main() {
    val n = readln().toInt()
    if (n % 7 == 0 || n % 7 == 2) print("CY")
    else print("SK")
}