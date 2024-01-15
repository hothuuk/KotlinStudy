package y2024m1.week2

fun main() {
    val a = readln().toBigInteger()
    val b = readln()
    val c = readln().toBigInteger()

    if (b == "*") print(a * c)
    else print(a + c)
}