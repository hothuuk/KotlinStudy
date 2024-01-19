package y2024m1.week3

data class Dot(val x: Int, val y: Int)

fun main() {
    val n = readln().toInt()

    val map = ArrayList<Dot> ()

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        map.add(Dot(a, b))
    }

    map.sortWith(
        compareBy(
            {it.y},
            {it.x}
        )
    )

    map.forEach {
        println("${it.x} ${it.y}")
    }
}