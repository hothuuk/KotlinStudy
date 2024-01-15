package y2023m12.day9

import java.util.StringTokenizer

var cnt = 1
var num = 0

lateinit var box: Array<Array<Int>>
lateinit var answer: Array<Int>

fun main() {

    val st = StringTokenizer(readln())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    num = (n * 2) + (m * 2)

    answer = Array(num) { 0 }

    box = Array(n + 2) { Array(m + 2) { 0 } }

    setNumber(n + 2, m + 2)

    setMirror(n + 1, m + 1)

    shootLight(n, m)

    print(answer.joinToString(" "))
}

fun shootLight(n: Int, m: Int) {

    // 1 = 오, 2 = 위, 3 = 왼, 4 = 아래
    var direction: Int
    var x: Int
    var y: Int
    var xup = 1
    var yup = 1

    for (i in 0 until num) {

        if (i < n) {
            x = 0
            y = yup++
            direction = 1
        } else if (i < n + m) {
            x = xup++
            y = n + 1
            direction = 2
            yup = y - 1
        } else if (i < (n * 2) + m) {
            x = m + 1
            y = yup--
            direction = 3
            xup = x - 1
        } else {
            x = xup--
            y = 0
            direction = 4
        }

        while (true) {
            when(direction) {
                1 -> {
                    x++

                    if (x >= m + 1) {
                        answer[i] = box[y][x]
                        break
                    }

                    if (box[y][x] == 1) {
                        direction = 2
                    }
                }
                2 -> {
                    y--

                    if (y <= 0) {
                        answer[i] = box[y][x]
                        break
                    }

                    if (box[y][x] == 1) {
                        direction = 1
                    }
                }
                3 -> {
                    x--

                    if (x <= 0) {
                        answer[i] = box[y][x]
                        break
                    }

                    if (box[y][x] == 1) {
                        direction = 4
                    }
                }
                4 -> {
                    y++

                    if (y >= n + 1) {
                        answer[i] = box[y][x]
                        break
                    }

                    if (box[y][x] == 1) {
                        direction = 3
                    }
                }
            }
        }
    }
}

fun setNumber(n: Int, m: Int) {

    for (i in 1 until n - 1) {
        box[i][0] = cnt++
    }

    for (i in 1 until m - 1) {
        box[n - 1][i] = cnt++
    }

    for (i in n - 2 downTo 1) {
        box[i][m - 1] = cnt++
    }

    for (i in m - 2 downTo 1) {
        box[0][i] = cnt++
    }
}

fun setMirror(n: Int, m: Int) {

    for (i in 1 until n) {
        val st = StringTokenizer(readln())
        for (j in 1 until m) {
            box[i][j] = st.nextToken().toInt()
        }
    }
}