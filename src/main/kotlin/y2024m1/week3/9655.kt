package y2024m1.week3

fun main() {
    val n = readln().toInt()
    if (n == 3 || n == 1) {
        print("SK")
        return
    }
    if (n % 2 == 0) print("CY")
    else print("SK")
}