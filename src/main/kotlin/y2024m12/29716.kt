package y2024m12

fun main() {
    val (j, n) = readln().split(" ").map { it.toInt() }
    var cnt = 0

    repeat(n) {
        val str = readln()
        var size = 0

        for (ch in str) {
            if (ch in 'A' .. 'Z') {
                size += 4
            } else if (ch in 'a' .. 'z' || ch in '0' .. '9') {
                size += 2
            } else if (ch == ' '){
                size += 1
            }
        }

        if (size <= j) cnt++
    }

    print(cnt)
}