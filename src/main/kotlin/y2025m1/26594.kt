package y2025m1

fun main() {
    val str = readln()
    var n = 1
    val c = str[0]

    for (i in 1 until str.length) {
        if (str[i] == c) {
            n++
        } else {
            break
        }
    }

    print(n)
}