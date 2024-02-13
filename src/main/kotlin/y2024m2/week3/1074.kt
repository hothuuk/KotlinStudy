package y2024m2.week3

import java.io.BufferedReader
import java.io.InputStreamReader

var answer = 0
var numbering = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map{ it.toInt() }
    val (n, r, c) = input

    visitGraph(1 shl(n), 0, 0, r, c)
    print(answer)
}

fun visitGraph(size: Int, row: Int, col: Int, targetRow: Int, targetCol: Int) {

    if (targetRow !in row until row + size || targetCol !in col until col + size) {
        numbering += size * size
        return
    }

    if (row == targetRow && col == targetCol) {
        answer = numbering
        return
    }

    val halfSize = size / 2

    visitGraph(halfSize, row, col, targetRow, targetCol)
    visitGraph(halfSize, row, col + halfSize, targetRow, targetCol)
    visitGraph(halfSize, row + halfSize, col, targetRow, targetCol)
    visitGraph(halfSize, row + halfSize, col + halfSize, targetRow, targetCol) 
}