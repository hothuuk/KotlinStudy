package y2024m1.week5

import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int> ()
    val sb = StringBuilder()

    var tmp = 1

    repeat(n) {
        val num = readln().toInt()

        while(tmp <= num){
            stack.push(tmp)
            sb.append("+\n")
            tmp++
        }

        if (num == stack.lastElement()) {
            stack.pop()
            sb.append("-\n")
        } else {
            print("NO")
            return
        }
    }

    print(sb)
}