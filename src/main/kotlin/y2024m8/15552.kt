package y2024m8

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = r.readLine().toInt()

    repeat(n) {
        w.write(r.readLine().split(" ").sumOf { it.toInt() }.toString())
        w.newLine()
    }

    w.flush()
}