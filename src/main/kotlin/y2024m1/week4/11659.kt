package y2024m1.week4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader( InputStreamReader(System.`in`) )
    var st: StringTokenizer
    val sb = StringBuilder()

    st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val list : MutableList<Int> = ArrayList()
    list.add(0, 0)

    st = StringTokenizer(br.readLine())
    for(i in 1 .. n) {
        list.add(list[i - 1] + Integer.parseInt(st.nextToken()))
    }

    for(i in 0 until m) {
        st = StringTokenizer(br.readLine())
        val num = st.nextToken().toInt()
        val num2 = st.nextToken().toInt()

        sb.append(list[num2] - list[num - 1]).append('\n')
    }

    print(sb)
}