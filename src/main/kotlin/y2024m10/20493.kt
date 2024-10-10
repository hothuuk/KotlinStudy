package y2024m10

private val gotoXY = listOf(
    1 to 0, // 동
    -1 to 0, // 서
    0 to -1, // 남
    0 to 1 // 북
)

private val dir = listOf(
    listOf(3, 2), // 동
    listOf(2, 3), // 서
    listOf(0, 1), // 남
    listOf(1, 0) // 북
)

fun main() {
    val (n, t) = readln().split(" ").map { it.toInt() }
    val moves = Array(n) { readln().split(" ").let { Pair(it[0].toInt(), it[1].toDirIndex()) } }

    var cd = 0
    var ct = 0
    var ans = 0 to 0

    for ((dt, di) in moves) {
        val (dx, dy) = gotoXY[cd]
        val (cx, cy) = ans
        val tt = dt - ct

        val nx = tt * dx
        val ny = tt * dy

        cd = dir[cd][di]
        ct = dt
        ans = (cx + nx) to (cy + ny)
    }

    val (dx, dy) = gotoXY[cd]
    val (cx, cy) = ans
    val tt = t - ct

    val nx = tt * dx
    val ny = tt * dy

    ans = (cx + nx) to (cy + ny)
    print("${ans.first} ${ans.second}")
}

private fun String.toDirIndex(): Int {
    return if (this == "left") 0 else 1
}