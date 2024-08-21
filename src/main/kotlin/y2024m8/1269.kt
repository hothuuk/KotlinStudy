package y2024m8

fun main() {
    readln()
    val numsA = readln().split(" ").map { it.toInt() }
    val numsB = readln().split(" ").map { it.toInt() }

    print(numsA.minus(numsB.toSet()).size + numsB.minus(numsA.toSet()).size)
}