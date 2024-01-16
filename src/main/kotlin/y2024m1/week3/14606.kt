package y2024m1.week3

fun main() {
    val n = readln().toInt()
    print(pizza(n))
}

fun pizza(n: Int): Int {
    val a: Int
    val b: Int

    if (n == 1) return 0

    if (n % 2 == 0) {
        a = n / 2
        b = n / 2
    } else {
        a = n / 2 + 1
        b = n / 2
    }

    return (a * b) + pizza(a) + pizza(b)
}