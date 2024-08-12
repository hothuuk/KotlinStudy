package y2024m8

import kotlin.math.max

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val box = readln().split(" ").map { it.toInt() }.toIntArray()
    val book = readln().split(" ").map { it.toInt() }.toIntArray()

    var index1 = 0
    var index2 = 0

    while(true) {
        if (index2 == m) break

        val currentBook = book[index2]
        book[index2] = max(0, book[index2] - box[index1])
        box[index1] = max(0, box[index1] - currentBook)

        if (box[index1] == 0) index1++
        if (book[index2] == 0) index2++
    }

    print(box.sum())
}