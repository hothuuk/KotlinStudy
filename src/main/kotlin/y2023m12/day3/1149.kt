package y2023m12.day3

import java.util.*
import kotlin.math.min


fun main() {
    val n = readln().toInt()

    val r = arrayListOf<Int>()
    val g = arrayListOf<Int>()
    val b = arrayListOf<Int>()

    val dpR = Array(n){ 0 }
    val dpG = Array(n){ 0 }
    val dpB = Array(n){ 0 }

    repeat(n){
        val str = StringTokenizer(readlnOrNull())
        r.add(str.nextToken().toInt())
        g.add(str.nextToken().toInt())
        b.add(str.nextToken().toInt())
    }

    dpR[0] = r[0]
    dpG[0] = g[0]
    dpB[0] = b[0]

    for(i in 1 until n){
        dpR[i] = min(dpG[i - 1], dpB[i - 1]) + r[i]
        dpG[i] = min(dpR[i - 1], dpB[i - 1]) + g[i]
        dpB[i] = min(dpR[i - 1], dpG[i - 1]) + b[i]
    }

    val result = min(dpR[n - 1], min(dpG[n - 1], dpB[n - 1]))

    println(result)
}
