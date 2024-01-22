package y2024m1.week4

fun main() {
    var (n, money) = readln().split(" ").map { it.toInt() }
    var cnt = 0
    val moneys = IntArray(n)

    repeat(n) {
        moneys[it] = readln().toInt()
    }

    var idx = n - 1

    while (money > 0) {
        if (money >= moneys[idx]) {
            val num = money / moneys[idx]

            money -= num * moneys[idx]
            cnt += num
        }
        idx--
    }

    print(cnt)
}