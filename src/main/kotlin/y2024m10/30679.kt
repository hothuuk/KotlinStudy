package y2024m10

private val directions = arrayOf(
    1 to 0,
    0 to 1,
    -1 to 0,
    0 to -1
)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    var cnt = 0
    val ans = ArrayList<Int>()

    for (i in 0 until n) {
        if (trapTheStar(map, i)) {
            cnt++
            ans.add(i + 1)
        }
    }

    print(cnt)
    if (ans.isNotEmpty()) print("\n" + ans.joinToString(" "))
}

private fun trapTheStar(map: Array<IntArray>, yn: Int): Boolean {
    var x = 0
    var y = yn
    var dir = 0
    val (n, m) = map.size to map[0].size
    val visited = Array(n) { Array(m) { BooleanArray(4) } }
    visited[y][x][dir] = true

    while (true) {
        val move = map[y][x]
        val (dx, dy) = directions[dir]
        val nx = x + dx * move
        val ny = y + dy * move

        if (nx !in 0 until m || ny !in 0 until n) return false

        x = nx
        y = ny

        if (visited[y][x][dir]) return true
        else visited[y][x][dir] = true

        dir = (dir + 1) % 4
    }
}