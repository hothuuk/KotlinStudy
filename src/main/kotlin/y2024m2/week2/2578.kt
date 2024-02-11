package y2024m2.week2

private lateinit var bingo: Array<Array<Int>>
private lateinit var call: Array<Array<Int>>

private const val N = 5

fun main() {

    bingo = Array(N) { Array(N) {0} }
    call = Array(N) { Array(N) {0} }

    for (i in 0 until N) {
        val nums = readln().split(" ").map { it.toInt() }
        for (j in 0 until N) {
            bingo[i][j] = nums[j]
        }
    }

    for (i in 0 until N) {
        val nums = readln().split(" ").map { it.toInt() }
        for (j in 0 until N) {
            call[i][j] = nums[j]
        }
    }

    print(calling())
}

private fun calling(): Int {

    var cnt = 0

    for (i in 0 until N) {
        for (j in 0 until N) {
            cnt++

            foundNum(call[i][j])

            if (bingoCheck() >= 3) {
                return cnt
            }
        }
    }

    return cnt
}

private fun foundNum(n: Int) {

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (bingo[i][j] == n) {
                bingo[i][j] = 0
                return
            }
        }
    }
}

private fun bingoCheck(): Int {

    var cnt = 0

    for (i in 0 until N) {
        var check = 0
        for (j in 0 until N) {
            if (bingo[i][j] == 0) check++
        }

        if (check == 5) cnt++
    }

    for (i in 0 until N) {
        var check = 0
        for (j in 0 until N) {
            if (bingo[j][i] == 0) check++
        }

        if (check == 5) cnt++
    }

    var check2 = 0

    for (i in 0 until N) {
        if (bingo[i][i] == 0) check2++
    }

    if (check2 == 5) cnt++
    check2 = 0

    var m = 0

    for (i in N - 1 downTo 0) {
        if (bingo[m++][i] == 0) check2++
    }

    if (check2 == 5) cnt++

    return cnt
}