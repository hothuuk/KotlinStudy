package y2024m1.week2

import java.util.*

fun main() {
    val ch = Array(26) { 0 }

    val st = readln()
    val str = st.lowercase(Locale.getDefault())

    for (c in str) {
        ch[c.code - 97]++
    }

    var max = 0
    var idx = -1
    var chk = true

    for (i in 0 until 26) {
        if (max < ch[i]) {
            max = ch[i]
            idx = i
            chk = true
        } else if (max == ch[i]) {
            chk = false
        }
    }

    if (!chk) {
        print("?")
        return
    }

    print((idx + 65).toChar())
}