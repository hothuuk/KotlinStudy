package y2024m2.week5

import java.util.TreeMap

fun main() {
    val n = readln().toInt()

    val sb = StringBuilder()

    repeat(n) {
        val t = readln().toInt()
        val tm = TreeMap<Int, Int>()

        repeat(t) {
            val (a, b) = readln().split(" ")

            when(a[0]) {
                'I' -> {
                    tm[b.toInt()] = tm.getOrDefault(b.toInt(), 0) + 1
                }

                'D' -> {
                    if (!tm.isEmpty()) {
                        val key = if (b.toInt() == 1) tm.lastKey() else tm.firstKey()
                        val keyCnt = tm[key]

                        if (keyCnt == 1) tm.remove(key)
                        else tm[key] = keyCnt!! - 1
                    }
                }
            }
        }

        if (tm.isEmpty()) {
            sb.append("EMPTY").append("\n")
        } else {
            sb.append("${tm.lastKey()} ${tm.firstKey()}").append("\n")
        }
    }

    print(sb)
}