package y2024m2.week5

import java.util.*

private lateinit var arr: Array<IntArray>
private lateinit var snake: Deque<Pair<Int, Int>>
private lateinit var dirQueue: Queue<Pair<Int, String>>

private var time = 0
private var dir = 0

private val goX = intArrayOf(0, 1, 0, -1)
private val goY = intArrayOf(1, 0, -1, 0)

private fun main() {

    val n = readln().toInt()
    val k = readln().toInt()


    arr = Array(n) { IntArray(n) }
    snake = LinkedList()
    dirQueue = LinkedList()

    for (i in 0 until k) {
        val apple = readln().split(' ').map(String::toInt)
        arr[apple[0] - 1][apple[1] - 1] = 1
    }

    val l = readln().toInt()

    for (i in 0 until l) {
        val s = readln().split(' ')
        val x = s[0].toInt()
        val c = s[1]
        dirQueue.add(Pair(x, c))
    }
    snake.add(Pair(0, 0))

    while (true) {
        time++
        val headX = snake.peekFirst().first + goX[dir]
        val headY = snake.peekFirst().second + goY[dir]

        if (headX < 0 || headX >= n || headY < 0 || headY >= n) break

        if (snake.contains(Pair(headX, headY))) break

        if (arr[headX][headY] == 1) {
            arr[headX][headY] = 0
            snake.offerFirst(Pair(headX, headY))
        } else {
            snake.offerFirst(Pair(headX, headY))
            snake.pollLast()
        }

        if (dirQueue.isNotEmpty()) {
            if (dirQueue.peek().first == time) {
                val c = dirQueue.poll().second
                if (c == "D") {
                    dir = (dir + 1) % 4
                } else if (c == "L") {
                    if (dir == 0) dir = 3
                    else dir -= 1
                }
            }
        }
    }

    println(time)
}