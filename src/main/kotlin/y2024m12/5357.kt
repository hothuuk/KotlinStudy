package y2024m12

import java.util.Stack

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val str = readln()
        val stack = Stack<Char>()
        var ans = ""
        stack.add(' ')

        for (ch in str) {
            if (ch == stack.peek()) continue
            stack.add(ch)
            ans += ch.toString()
        }

        sb.append(ans).append("\n")
    }

    print(sb)
}