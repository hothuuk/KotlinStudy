package y2024m1.week3

fun main() {
    val n = readln().toInt()
    val queue = IntArray(n)
    var left = 0
    var right = -1

    repeat(n) {
        when(val option = readln()) {
            "pop" -> {
                if (left > right) println(-1)
                else println(queue[left++])
            }
            "size" -> {
                if (left > right) println(0)
                else println(right - left + 1)
            }
            "empty" -> {
                println(if (left > right) 1 else 0)
            }
            "front" -> {
                if (left > right) println(-1)
                else println(queue[left])
            }
            "back" -> {
                if (left > right)println(-1)
                else println(queue[right])
            }
            else -> {
                val number = option.split(" ")[1].toInt()
                queue[++right] = number
            }
        }
    }
}