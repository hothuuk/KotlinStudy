package y2024m8

fun main() {
    val str = readln()
    var temp = ' '
    var n = 1L

    for (ch in str) {
        if (ch == 'c') {
            n *= if (temp == 'c') {
                25
            } else {
                26
            }
            n %= 1000000009

            temp = 'c'
        } else {
            n *= if (temp == 'd') {
                9
            } else {
                10
            }
            n %= 1000000009

            temp = 'd'
        }
    }

    print(n)
}
