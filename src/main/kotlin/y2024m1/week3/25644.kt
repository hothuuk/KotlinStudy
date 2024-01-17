package y2024m1.week3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    var answer = 0
    var min = Int.MAX_VALUE

    repeat(n) {
        val cur = st.nextToken().toInt()
        answer = maxOf(answer, cur - min)
        min = minOf(min, cur)
    }

    println(answer)
}