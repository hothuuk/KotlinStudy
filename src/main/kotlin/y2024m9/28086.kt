package y2024m9

import kotlin.math.floor

fun main() {
    val input = readln()
    val (operator, left, right) = parse(input)

    var ans = 0L

    when (operator) {
        '+' -> ans = left + right
        '-' -> ans = left - right
        '*' -> ans = left * right
        '/' -> {
            if (right == 0L) {
                println("invalid")
                return
            }

            ans = floor(left.toDouble() / right).toLong()
        }
    }

    print(toOctal(ans))
}

private fun parse(s: String): Triple<Char, Long, Long> {
    val operators = listOf('+', '/', '*', '-')

    for (operator in operators) {
        val idx = if (operator != '-') {
            s.indexOf(operator)
        } else {
            if (s[0] == '-') {
                s.drop(1).indexOf(operator) + 1
            } else {
                s.indexOf(operator)
            }
        }

        if (idx == -1) continue

        val l = s.substring(0, idx).trim().toLong(8)
        val r = s.substring(idx + 1).trim().toLong(8)

        return Triple(operator, l, r)
    }

    return Triple(' ', 0, 0)
}

private fun toOctal(n: Long): Long {
    return if (n < 0) {
        java.lang.Long.toOctalString(n * -1).toLong() * -1
    } else {
        java.lang.Long.toOctalString(n).toLong()
    }
}
