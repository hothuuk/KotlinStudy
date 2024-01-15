package y2024m1.week2

fun main() {
    val str = readln()
    var h = 0
    var t = str.length - 1
    val n = str.length / 2

    repeat(n) {
        if (str[h] != str[t]) {
            print("0")
            return
        }

        h++
        t--
    }

    print("1")
}