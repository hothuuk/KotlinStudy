package y2024m12

fun main() {
    val sb = StringBuilder()

    while (true) {
        val check = BooleanArray(26)
        val str = readln()

        if (str == "*") break

        for (ch in str) {
            if (ch == ' ') continue
            check[ch - 'a'] = true
        }

        sb.append(if (check.count { it } == 26) "Y\n" else "N\n")
    }

    print(sb)
}