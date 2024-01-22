package y2024m1.week3

import java.util.Stack

fun main() {
    val n = readln().toInt()
    var cnt = 0

    repeat(n) {
        val stack = Stack<Char> ()
        var str = readln()

        for (ch in str) {
            if (stack.isEmpty()) {
                stack.add(ch)
            } else {
                if (stack.lastElement() == ch) {
                    stack.pop()
                } else {
                    stack.add(ch)
                }
            }
        }

        if (stack.isEmpty()) {
            cnt++
        }
    }

    print(cnt)
}