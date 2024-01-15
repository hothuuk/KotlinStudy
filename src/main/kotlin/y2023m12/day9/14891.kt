package y2023m12.day9

import java.util.StringTokenizer
import kotlin.math.pow

const val N = 4
const val M = 8
val gears = Array(N) { Array(M) { 0 } }
var times = 0
var score = 0
val turnCheck = arrayOf(0, 0, 0, 0)
fun main() {

    for (i in 0 until N) {
        val st = StringTokenizer(readln())
        var value = st.nextToken().toInt()
        for (j in M - 1 downTo  0) {
            gears[i][j] = value % 10
            value /= 10
        }
    }

    times = readln().toInt()

    for (i in 0 until times) {
        val st = StringTokenizer(readln())

        val gear = st.nextToken().toInt()
        val turn = st.nextToken().toInt()

        rotation(gear - 1, turn)

        for (j in 0 until 4) {
            turnCheck[j] = 0
        }
    }

    for (i in 0 until N) {
        if (gears[i][0] == 1) {
            score += 2.0.pow(i).toInt()
        }
    }

    print(score)
}

fun rotation(gear: Int, turn: Int) {

    turnCheck[gear]++

    if (turn == 1) {
        if (gear - 1 >= 0) {
            if (gears[gear - 1][2] != gears[gear][6] && turnCheck[gear - 1] == 0) {
                turnCheck[gear - 1]++
                rotation(gear - 1, -1)
            }
        }

        if (gear + 1 <= 3) {
            if (gears[gear + 1][6] != gears[gear][2] && turnCheck[gear + 1] == 0) {
                turnCheck[gear + 1]++
                rotation(gear + 1, -1)
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
                rotation(gear - 1, 1)
            }
        }

        if (gear + 1 <= 3) {
            if (gears[gear + 1][6] != gears[gear][2] && turnCheck[gear + 1] == 0) {
                turnCheck[gear + 1]++
                rotation(gear + 1, 1)
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
