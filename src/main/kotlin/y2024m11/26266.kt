package y2024m11

fun main() {
    val a = readln()
    val b = readln()
    val c = StringBuilder()

    for (i in a.indices) {
        val code = b[i] - a[i]
        val newCode = code + 'A'.code - 1
        c.append(if (code > 0) newCode.toChar() else (newCode + 26).toChar())
    }

    print(find(c.toString()))
}

private fun find(s: String): String {
    val len = s.length

    for (i in 1 .. len / 2) {
        if (len % i == 0) {
            val ns = s.substring(0, i)

            if (ns.repeat(len / i) == s) {
                return ns
            }
        }
    }

    return s
}