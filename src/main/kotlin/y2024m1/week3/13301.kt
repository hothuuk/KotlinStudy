package y2024m1.week3

fun main() {
    val n = readln().toInt()

    val box = ArrayList<Long> ()

    box.add(1)
    box.add(1)

    for (i in 2 until 80) {
        box.add(box[i - 2] + box[i - 1])
    }

    if (n != 1) print((box[n - 1] * 4) + (box[n - 2] * 2))
    else print(4)
}