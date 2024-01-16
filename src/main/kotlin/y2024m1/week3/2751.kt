package y2024m1.week3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stringBuilder = StringBuilder()

    val n = br.readLine().toInt()
    val list = ArrayList<Int>()

    for(i in 0 until n) {
        list.add(br.readLine().toInt())
    }

    list.sort()

    for(i in list) {
        stringBuilder.append(i).append("\n")
    }

    println(stringBuilder)
}
