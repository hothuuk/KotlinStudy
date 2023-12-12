package y2023m12.day5

fun main() {
    val n = 8
    val board = Array(n) { Array(n) {' '} }
    var answer = 0

    for (i in 0 until n) {
        val line = readln()
        for (j in 0 until n) {
            board[i][j] = line[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i % 2 == 0 && j % 2 == 0 && board[i][j] == 'F') answer++

            if (i % 2 == 1 && j % 2 == 1 && board[i][j] == 'F') answer++
        }
    }

    print(answer)
}