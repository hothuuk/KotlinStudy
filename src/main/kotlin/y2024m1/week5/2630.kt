package y2024m1.week5

private lateinit var paper: Array<Array<Int>>
private var white = 0
private var blue = 0

fun main() {
    val n = readln().toInt()

    paper = Array(n) { Array(n) { 0 } }
    for (i in 0 until n) {
        val m = readln().split(" ").map { it.toInt() }
        for (j in 0 until n) {
            paper[i][j] = m[j]
        }
    }

    cutting(n, 0, 0)

    print("$white\n$blue")
}

fun cutting(n: Int, x: Int, y: Int) {

    var sum = 0

    for (i in y until y + n) {
        for (j in x until x + n) {
            sum += paper[i][j]
        }
    }

    if (sum == n * n) {
        blue++
        return
    } else if (sum == 0) {
        white++
        return
    }
    else {
        cutting(n / 2, x, y)
        cutting(n / 2, x + n / 2, y)
        cutting(n / 2, x, y + n / 2)
        cutting(n / 2, x + n / 2, y + n / 2)
    }
}