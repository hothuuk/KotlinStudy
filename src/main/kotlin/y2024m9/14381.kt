package y2024m9

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) { case ->
        val n = readln().toInt()

        if (n == 0) {
            sb.append("Case #${case + 1}: INSOMNIA\n")
        } else {
            val record = IntArray(10)
            var tmp = n

            while (true) {
                tmp.toString().forEach { digit ->
                    record[digit - '0'] = 1
                }

                if (record.all { it == 1 }) {
                    break
                } else {
                    tmp += n
                }
            }

            sb.append("Case #${case + 1}: $tmp\n")
        }
    }

    print(sb)
}
