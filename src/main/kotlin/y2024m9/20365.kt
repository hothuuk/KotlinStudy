package y2024m9

fun main() {
    val n = readln().toInt()
    val colors = readln()

    var rc = 0
    var bc = 0
    var cc = colors[0]

    for (i in 1 until n) {
        if (cc != colors[i]) {
            if (cc == 'R') rc++ else bc++
            cc = colors[i]
        }
    }

    if (cc == 'R') rc++ else bc++

    print(minOf(rc, bc) + 1)
}