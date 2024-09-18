package y2024m9

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val n = readln().toInt()
        val rn = n.toString().reversed().toInt()
        val sum = (n + rn).toString()

        var check = true

        for (i in 0 until sum.length / 2) {
            if (sum[i] != sum[sum.length - i - 1]) {
                check = false
                break
            }
        }

        sb.append(if (check) "YES" else "NO").append("\n")
    }

    print(sb)
}