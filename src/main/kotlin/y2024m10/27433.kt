package y2024m10

fun main() {
    val n = readln().toInt()

    if (n == 0) {
        print(1)
        return
    }

    var pack = 1L

    for (i in 1 .. n) {
        pack *= i
    }

    print(pack)
}