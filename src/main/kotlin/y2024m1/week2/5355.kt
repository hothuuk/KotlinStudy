package y2024m1.week2

import java.util.StringTokenizer

fun main() {

    var st = StringTokenizer(readln())
    val n = st.nextToken().toInt()

    repeat(n) {
        st = StringTokenizer(readln())
        val m = st.countTokens() - 1
        var a = st.nextToken().toDouble()
        repeat(m) {
            when(st.nextToken().toString()) {
                "@" -> a *= 3
                "%" -> a += 5
                "#" -> a -= 7
            }
        }
        println(String.format("%.2f", a))
    }
}