package y2024m1.week5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()

    val list = IntArray(10001)

    for (i in 0 until n) {
        list[br.readLine().toInt()]++
    }

    for (i in 1..10000) {
        bw.write("$i\n".repeat(list[i]))
    }

    bw.flush()
    bw.close()
    br.close()
}