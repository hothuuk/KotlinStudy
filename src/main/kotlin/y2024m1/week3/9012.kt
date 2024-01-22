package y2024m1.week3

import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Char> ()

    repeat(n) {
        val str = readln()

        for (ch in str) {
            val last = if (stack.isNotEmpty()) stack.peek() else null

            if (last == '(' && ch == ')') stack.pop()
            else stack.add(ch)
        }

        if (stack.isEmpty()) println("YES") else println("NO")
        stack.clear()
    }
}