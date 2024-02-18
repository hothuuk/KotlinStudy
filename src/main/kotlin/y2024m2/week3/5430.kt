package y2024m2.week3

fun main() {
    var t = readln().toInt()

    val dq = ArrayDeque<String> ()
    val sb = StringBuilder()

    while (t --> 0) {
        dq.clear()

        val str = readln()
        val n = readln().toInt()
        val arr = readln().replace("[", "").replace("]", "")

        if (n > 1) {
            arr.split(",").forEach {
                dq.addLast(it)
            }
        } else dq.addLast(arr)

        if (str.count { it == 'D' } > n) {
            sb.append("error\n")
            continue
        }

        var cnt = 0

        str.forEach { ch ->

            if (ch == 'D') {
                if (cnt % 2 == 0) {
                    dq.removeFirst()
                } else {
                    dq.removeLast()
                }
            } else if (ch == 'R') {
                cnt++
            }
        }

        if (cnt % 2 != 0) dq.reverse()
        sb.append(dq.joinToString(",", "[", "]")).append("\n")
    }

    print(sb)
}