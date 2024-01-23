package y2024m1.week4

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = HashMap<String, String>()

    repeat(n) {
        val (a, b) = readln().split(" ").map { it }
        map[a] = b
    }

    repeat(m) {
        val a = readln()
        println(map[a])
    }
}