package y2024m2.week5

import java.util.Stack

fun main() {
    val str = readln()
    val boom = readln()

    val len = boom.length

    val stack = Stack<Char>()

    for (ch in str) {
        stack.push(ch)

        if (stack.size >= len) {
            var check = true

            for (i in 0 until len) {
                if (stack[stack.size - len + i] != boom[i]) {
                    check = false
                    break
                }
            }

            if (check) {
                repeat(len) {
                    stack.pop()
                }
            }
        }
    }

    if (stack.isEmpty()) {
        print("FRULA")
    } else {
        print(stack.joinToString(""))
    }
}