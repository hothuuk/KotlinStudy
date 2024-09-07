package y2024m9

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.log2
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val q = br.readLine().toInt()
    val nums = mutableMapOf<Long, Int>()
    val counts = Array(64) { 0 }

    repeat(q) {
        val query = br.readLine()
        val n = query.drop(1).toLong()
        val log = if (n > 0) log2(n.toDouble()).toInt() else -1

        if (query[0] == '+') {
            if (n > 0) {
                nums[n] = nums.getOrDefault(n, 0) + 1
                counts[log]++
            }
        } else {
            nums[n]?.let { count ->
                if (count == 1) {
                    nums.remove(n)
                } else {
                    nums[n] = count - 1
                }

                counts[log]--
            }
        }

        val updatedCounts = Array(64) { 0 }

        for (i in 0 until 63) {
            updatedCounts[i] += counts[i]

            if (updatedCounts[i] >= 2) {
                updatedCounts[i + 1] += updatedCounts[i] / 2
            }
        }

        val max = updatedCounts.indexOfLast { it > 0 }
        val result = if (max >= 0) (2.0).pow(max).toLong() else 0L
        bw.write("$result\n")
    }

    bw.flush()
    bw.close()
}