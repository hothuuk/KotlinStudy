package y2024m1.week3

fun main() {
    val n = readln().toInt()

    for (i in n - 60 until n) {
        if (n == sum(i)) {
            print(i)
            return
        }
    }

    print("0")
}

fun sum(n: Int): Int {
    var sum = 0
    var m = n
    while (m != 0) {
        sum += m % 10
        m /= 10
    }
    return sum + n
}