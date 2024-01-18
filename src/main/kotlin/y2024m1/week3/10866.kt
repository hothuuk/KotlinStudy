package y2024m1.week3

import java.util.LinkedList

fun main() {
    val list: LinkedList<Int> = LinkedList()
    val n = readln().toInt()

    repeat(n) {
        when(val line = readln()) {
            "pop_front" -> {
                if(list.size == 0) println(-1) else println(list.removeFirst())
            }
            "pop_back" -> {
                if(list.size == 0) println(-1) else println(list.removeLast())
            }
            "size" -> {
                println(list.size)
            }
            "empty" -> {
                println(if(list.size == 0) 1 else 0)
            }
            "front" -> {
                if(list.size == 0) println(-1) else println(list.first)
            }
            "back" -> {
                if(list.size == 0) println(-1) else println(list.last)
            }
            else -> {
                if(line.startsWith("push_front")) {
                    list.addFirst(line.split(" ")[1].toInt())
                } else {
                    list.addLast(line.split(" ")[1].toInt())
                }
            }
        }
    }
}
