package y2024m1.week1

import java.util.StringTokenizer

var N = 0
const val M = 8
var times = 0
var score = 0
fun main() {

    var st = StringTokenizer(readln())

    N = st.nextToken().toInt()

    val gears = Array(N) { Array(M) { 0 } }
    val turnCheck = Array(N) { 0 }

    for (i in 0 until N) {
        st = StringTokenizer(readln())
        var value = st.nextToken().toInt()
        for (j in M - 1 downTo  0) {
            gears[i][j] = value % 10
            value /= 10
        }
    }

    times = readln().toInt()

    for (i in 0 until times) {
        st = StringTokenizer(readln())

        val gear = st.nextToken().toInt()
        val turn = st.nextToken().toInt()

        rotation(gear - 1, turn, gears, turnCheck)

        for (j in 0 until N) {
            turnCheck[j] = 0
        }
    }

    for (i in 0 until N) {
        if (gears[i][0] == 1) {
            score++
        }
    }

    print(score)
}

fun rotation(gear: Int, turn: Int, gears: Array<Array<Int>>, turnCheck: Array<Int>) {

    turnCheck[gear]++

    if (turn == 1) {
        if (gear - 1 >= 0) {
            if (gears[gear - 1][2] != gears[gear][6] && turnCheck[gear - 1] == 0) {
                turnCheck[gear - 1]++
                rotation(gear - 1, -1, gears, turnCheck)
            }
        }

        if (gear + 1 <= N - 1) {
            if (gears[gear + 1][6] != gears[gear][2] && turnCheck[gear + 1] == 0) {
                turnCheck[gear + 1]++
                rotation(gear + 1, -1, gears, turnCheck)
            }
        }

        val tmp = gears[gear][M - 1]

        for (i in M - 1 downTo  1) {
            gears[gear][i] = gears[gear][i - 1]
        }

        gears[gear][0] = tmp

        return
    } else {
        if (gear - 1 >= 0) {
            if (gears[gear - 1][2] != gears[gear][6] && turnCheck[gear - 1] == 0) {
                turnCheck[gear - 1]++
                rotation(gear - 1, 1, gears, turnCheck)
            }
        }

        if (gear + 1 <= N - 1) {
            if (gears[gear + 1][6] != gears[gear][2] && turnCheck[gear + 1] == 0) {
                turnCheck[gear + 1]++
                rotation(gear + 1, 1, gears, turnCheck)
            }
        }

        val tmp = gears[gear][0]

        for (i in 0 until M - 1) {
            gears[gear][i] = gears[gear][i + 1]
        }

        gears[gear][M - 1] = tmp

        return
    }
}
