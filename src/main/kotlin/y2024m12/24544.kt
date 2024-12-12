package y2024m12

fun main() {
    val n = readln().toInt()
    val interest = readln().split(" ").map { it.toInt() }
    val applied = readln().split(" ").map { it.toInt() == 1 }
    var sum = 0

    for (i in 0 until n) {
        if (!applied[i]) {
            sum += interest[i]
        }
    }

    println(interest.sum())
    print(sum)
}