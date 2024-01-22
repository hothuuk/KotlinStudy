package y2024m1.week3

import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val m = readln().toInt()
        if (m != 0) stack.add(m)
        else stack.pop()
    }

    print(stack.sum())
}