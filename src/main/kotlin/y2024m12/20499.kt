package y2024m12

fun main() {
    val (k, d, a) = readln().split("/").map { it.toInt() }
    print(if (k + a < d || d == 0) "hasu" else "gosu")
}