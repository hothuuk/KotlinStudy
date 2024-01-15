package y2024m1.week2

fun main() {
    val n = readln().toInt()
    val m = readln()
    var sum = 0

    for (ch in m) {
        sum += (ch - '0')
    }

    print(sum)
}