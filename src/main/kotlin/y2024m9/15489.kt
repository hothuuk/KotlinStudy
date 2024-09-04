package y2024m9

fun main() {
    val (r, c, w) = readln().split(" ").map { it.toInt() }
    val size = r + w
    val pascal = Array(size) { Array(size) { 0 } }

    for (y in 0 until size) {
        pascal[y][0] = 1
        for (x in 1 .. y) {
            pascal[y][x] = pascal[y - 1][x - 1] + pascal[y - 1][x]
        }
    }

    var sum = 0

    for (i in 0 until w) {
        for (j in 0 .. i) {
            sum += pascal[r - 1 + i][c - 1 + j]
        }
    }

    print(sum)
}