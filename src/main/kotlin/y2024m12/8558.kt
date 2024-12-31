package y2024m12

fun main() {
    val n = readln().toInt()
    var a = 1

    if (n >= 5) {
        print(0)
        return
    }

    for (i in 1 .. n) {
        a = (a * i) % 10
    }

    print(a)
}