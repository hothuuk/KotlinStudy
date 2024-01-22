package y2024m1.week4

fun main() {
    while (true) {
        val arr = readln().split(" ")
        val arr2 = IntArray(3)

        repeat(3) {
            arr2[it] = arr[it].toInt()
        }

        arr2.sort()

        if (arr2.sum() == 0) return

        if (arr2[2] * arr2[2] == (arr2[0] * arr2[0]) + (arr2[1] * arr2[1])) {
            println("right")
        } else println("wrong")
    }
}