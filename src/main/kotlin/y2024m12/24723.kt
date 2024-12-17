package y2024m12

fun main() {
    val n = readln().toInt()
    var m = 1

    repeat(n) {
        m *= 2
    }

    print(m)
}