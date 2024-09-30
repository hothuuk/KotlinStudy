package y2024m9

fun main() {
    val n = readln().toInt()
    val fibo = IntArray(n + 1)

    fibo[0] = 0
    fibo[1] = 1

    for (i in 2 .. n) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }

    print(fibo[n])
}