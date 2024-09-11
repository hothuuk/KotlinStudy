package y2024m9

fun main() {
    readln()
    val charges = readln().split(" ").map { it.toInt() }

    var y = 0
    var m = 0

    for (charge in charges) {
        y += (charge / 30 + 1) * 10
        m += (charge / 60 + 1) * 15
    }

    if (y == m) {
        print("Y M $y")
    } else if (y < m) {
        print("Y $y")
    } else {
        print("M $m")
    }
}