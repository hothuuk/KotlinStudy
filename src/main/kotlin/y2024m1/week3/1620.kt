package y2024m1.week3

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val map1 = mutableMapOf<String, Int>()
    val map2 = mutableMapOf<Int, String>()

    repeat(n) {
        val name = readln()
        map1.put(name, it + 1)
        map2.put(it + 1, name)
    }

    repeat(m) {
        val q = readln()

        if (q.chars().allMatch{Character.isDigit(it)}) {
            println(map2[q.toInt()])
        } else {
            println(map1[q])
        }
    }
}