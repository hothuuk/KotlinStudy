package y2024m1.week2

var cnt1 = 0
var cnt2 = 0

fun main() {
    val n = readln().toInt()
    val a = fibo1(n)
    val b = fibo2(n)
    print("${cnt1 + 1} $cnt2")
}

fun fibo1(n: Int): Int {
    if (n == 1 || n == 2) return 1
    cnt1++
    return (fibo1(n - 1) + fibo1(n - 2))
}

fun fibo2(n: Int): Int {
    val f = IntArray(n + 1)

    f[1] = 1
    f[2] = 1

    for (i in 3..n) {
        cnt2++
        f[i] = f[i - 1] + f[i - 2]
    }

    return f[n]
}