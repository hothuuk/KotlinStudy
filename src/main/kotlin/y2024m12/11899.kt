package y2024m12

import java.util.Stack

fun main() {
    val input = readln()
    val stack = Stack<Boolean>()
    var cnt = 0

    for (ch in input) {
        if (ch == ')') {
            if (stack.isEmpty()) {
                cnt++
                continue
            }

            stack.pop()
        } else {
            stack.add(true)
        }
    }

    print(cnt + stack.size)
}