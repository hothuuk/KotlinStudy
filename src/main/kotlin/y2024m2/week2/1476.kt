package y2024m2.week2

fun main() {
    val (e, s, m) = readln().split(" ").map { it.toInt() }

    var ecnt = 1
    var scnt = 1
    var mcnt = 1
    var year = 1

    while (true) {
        if (e == ecnt && s == scnt && m == mcnt) break
        ecnt++; scnt++; mcnt++; year++

        if (ecnt > 15) ecnt = 1
        if (scnt > 28) scnt = 1
        if (mcnt > 19) mcnt = 1
    }

    print(year)
}