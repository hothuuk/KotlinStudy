package y2024m1.week4

data class Location(val x: Int, val y: Int)

fun main() {
    val n = readln().toInt()
    val xy = ArrayList<Location> ()

    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        xy.add(Location(x, y))
    }

    xy.sortWith(compareBy<Location> {it.x}.thenBy { it.y })

    xy.forEach { println("${it.x} ${it.y}") }
}