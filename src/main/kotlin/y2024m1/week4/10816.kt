package y2024m1.week4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val stringBuilder = StringBuilder()

    val map = HashMap<Int, Int>()

    val n = br.readLine().toInt()
    var cards = StringTokenizer(br.readLine(), " ")

    repeat(n) {
        val key = cards.nextToken().toInt()
        map[key] = map.getOrDefault(key, 0) + 1
    }

    val m = br.readLine().toInt()
    cards = StringTokenizer(br.readLine(), " ")

    repeat(m) {
        val key = cards.nextToken().toInt()
        stringBuilder.append(map.getOrDefault(key, 0)).append(" ")
    }

    print(stringBuilder)
}