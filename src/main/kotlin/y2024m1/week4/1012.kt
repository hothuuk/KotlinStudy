package y2024m1.week4

val dx = arrayOf(0, 0, 1, -1)
val dy = arrayOf(1, -1, 0, 0)
lateinit var map1: Array<Array<Int>>
var n = 0
var m = 0

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val mnk = readln().split(" ")
        m = mnk[0].toInt()
        n = mnk[1].toInt()
        val k = mnk[2].toInt()
        var cnt = 0

        map1 = Array(n) { Array(m) { 0 } }

        repeat(k) {
            val (x, y) = readln().split(" ").map { it.toInt() }
            map1[y][x] = 1
        }

        repeat(n) { x ->
            repeat(m) { y ->
                if(dfs(x,y)) cnt++
            }
        }

        println(cnt)
    }
}

fun dfs(x: Int, y: Int): Boolean {
    if (map1[x][y] == 0) return false

    map1[x][y] = 0

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx !in 0 until n || ny !in 0 until m || map1[nx][ny] == 0)
            continue
        dfs(nx, ny)
    }

    return true
}
