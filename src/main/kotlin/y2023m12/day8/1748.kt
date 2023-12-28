package y2023m12.day8

fun main() {
    var n = readln().toInt()
    val len = n.toString().length
    var chk = 9
    var answer = 0

    for (i in 0 until len) {
        if (chk <= n) {
            answer += chk * (i + 1)
            n -= chk
        } else {
            answer += n * (i + 1)
        }

        chk *= 10
    }

    print(answer)
}