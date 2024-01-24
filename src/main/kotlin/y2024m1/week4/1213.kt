package y2024m1.week4

fun main() {

    val alpha = IntArray(26)
    val str = readln()
    str.forEach { alpha[it.code - 65]++ }

    var f = ""
    var m = ""
    var b = ""
    var check = false

    if (str.length % 2 == 0) {
        for (i in 0 until 26) {
            if (alpha[i] == 0) continue

            if (alpha[i] % 2 != 0) {
                check = true
                break
            }

            for (j in 0 until alpha[i] / 2) {
                f += (i + 65).toChar()
                b += (i + 65).toChar()
            }
        }
    } else {
        for(i in 0 until 26) {
            if(alpha[i] == 0) continue

            if(alpha[i] % 2 != 0 && m.isNotEmpty()) {
                check = true
                break
            }

            for(j in 0 until alpha[i]/2) {
                f += (i + 65).toChar()
                b += (i + 65).toChar()
            }

            if(alpha[i] % 2 != 0) {
                m += (i + 65).toChar()
            }
        }
    }

    print(if (check) "I'm Sorry Hansoo" else f + m + b.reversed())
}