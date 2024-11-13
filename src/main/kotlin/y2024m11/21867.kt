package y2024m11

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    br.readLine()
    val str = br.readLine()
    val ans = StringBuilder()

    for (ch in str) {
        if (ch == 'J' || ch == 'A' || ch == 'V') continue
        ans.append(ch)
    }

    print(ans.ifEmpty { "nojava" })
    br.close()
}