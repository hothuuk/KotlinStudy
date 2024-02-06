package y2024m2.week2

private lateinit var map: Array<Array<Int>>
private lateinit var visit: Array<Array<Boolean>>

fun main() {

    val n = readln().toInt()

    map = Array(n) { Array(n) {0} }
    visit = Array(n) { Array(n) {false} }
    val house = ArrayList<Int>()

    for (i in 0 until n) {
        val m = readln()
        for (j in 0 until n) {
            map[i][j] = m[j] - '0'
        }
    }

    var cnt = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == 1 && !visit[i][j]) {
                house.add(houseChk(j, i))
                cnt++
            }
        }
    }

    house.sort()

    println(cnt)
    house.forEach { println(it) }
}

private fun houseChk(x: Int, y: Int): Int {

    var cnt = 1

    visit[y][x] = true

    if (x + 1 < map.size && map[y][x + 1] == 1 && !visit[y][x + 1]) {
        cnt += houseChk(x + 1, y)
    }
    if (x - 1 >= 0 && map[y][x - 1] == 1 && !visit[y][x - 1]) {
        cnt += houseChk(x - 1, y)
    }
    if (y + 1 < map.size && map[y + 1][x] == 1 && !visit[y + 1][x]) {
        cnt += houseChk(x, y + 1)
    }
    if (y - 1 >= 0 && map[y - 1][x] == 1 && !visit[y - 1][x]) {
        cnt += houseChk(x, y - 1)
    }

    return cnt
}