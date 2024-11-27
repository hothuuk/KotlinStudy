package y2024m11

fun main() {
    val n = readln().toInt()
    var cnt = 0

    for (a in 1 .. 1000) {
        val aa = a * a

        for (b in a + 1 .. 1000) {
            val bb = b * b

            if (bb - aa == n) {
                cnt++
            } else if (bb - aa > n) {
                break
            }
        }
    }

    print(cnt)
}