package y2024m2.week2

private lateinit var map: Array<Array<Int>>
private lateinit var visit: Array<Array<Boolean>>

fun main() {

    val info = readln().split(" ").map { it.toInt() }
    val y = info[0]
    val x = info[1]
    val n = info[2]

    map = Array(y) { Array(x) {0} }
    visit = Array(y) { Array(x) {false} }

    repeat(n) {
        val location = readln().split(" ").map { it.toInt() }
        val x1 = location[0]
        val y1 = location[1]
        val x2 = location[2]
        val y2 = location[3]

        for (i in y1 until  y2) {
            for (j in x1 until  x2) {
                map[i][j] = 1
            }
        }
    }

    var cnt = 0
    val area = ArrayList<Int>()

    for (i in 0 until y) {
        for (j in 0 until x) {
            if (map[i][j] == 0 && !visit[i][j]) {
                area.add(dfs(j, i))
                cnt++
            }
        }
    }

    area.sort()

    println(cnt)
    area.forEach { print("$it ") }
}

private fun dfs(x: Int, y: Int): Int {

    var cnt = 1

    visit[y][x] = true

    if (x + 1 < map[0].size && map[y][x + 1] == 0 && !visit[y][x + 1]) {
        cnt += dfs(x + 1, y)
    }
    if (x - 1 >= 0 && map[y][x - 1] == 0 && !visit[y][x - 1]) {
        cnt += dfs(x - 1, y)
    }
    if (y + 1 < map.size && map[y + 1][x] == 0 && !visit[y + 1][x]) {
        cnt += dfs(x, y + 1)
    }
    if (y - 1 >= 0 && map[y - 1][x] == 0 && !visit[y - 1][x]) {
        cnt += dfs(x, y - 1)
    }

    return cnt
}