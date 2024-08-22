package y2024m8

fun main() = print((2..readln().toInt()).fold(1L) { acc, i -> acc * i })