package y2024m9

fun main() {
    val str = readln()
    var cnt = 0
    var n = 1

    for (i in 1 until str.length) {
        if (str[i] == str[i - 1] + 1) {
            n++
        } else {
            if (n == 3) cnt++
            n = 1
        }
    }

    if (n == 3) cnt++

    print(cnt)
}
