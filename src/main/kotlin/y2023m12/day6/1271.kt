package y2023m12.day6

import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())

    val a = st.nextToken().toBigInteger()
    val b = st.nextToken().toBigInteger()

    println(a / b)
    println(a % b)
}