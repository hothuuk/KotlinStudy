package y2024m1.week3

import java.util.Stack

fun main() {

    val stack = Stack<Char> ()

    while (true) {
        val str = readln()

        if (str == ".") return

        for (ch in str) {

            val last = if (stack.isNotEmpty()) stack.peek() else null

            if (ch == '(' || ch == ')' || ch == '[' || ch == ']') {
                if (last == '(' && ch ==')') stack.pop()
                else if (last == '[' && ch ==']') stack.pop()
                else stack.add(ch)
            }
        }

        if (stack.isEmpty()) println("yes") else println("no")
        stack.clear()
    }
}