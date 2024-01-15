package y2024m1.week2

fun main() {
    var n = readln().toInt()
    var m = 665

    while (n != 0) {
        m++
        if (m.toString().contains("666")) {
            n--
        }
    }

    print(m)
}