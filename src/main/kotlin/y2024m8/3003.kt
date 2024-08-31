package y2024m8

fun main() {
    val cur = readln().split(" ").map { it.toInt() }
    val pieces = arrayOf(1, 1, 2, 2, 2, 8)
    val answer = IntArray(6)

    for (i in 0 until 6) {
        answer[i] = pieces[i] - cur[i]
    }

    print(answer.joinToString(" "))
}