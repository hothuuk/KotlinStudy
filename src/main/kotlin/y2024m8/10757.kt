package y2024m8

fun main() {
    val (a, b) = readln().split(" ").map { it.toBigInteger() }
    print(a.add(b))
}