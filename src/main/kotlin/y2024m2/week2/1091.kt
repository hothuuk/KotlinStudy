package y2024m2.week2

private lateinit var player: IntArray
private lateinit var shuffle: IntArray
private lateinit var first: IntArray
private lateinit var save: IntArray

private var n = 0

fun main() {
    n = readln().toInt()

    player = IntArray(n)
    shuffle = IntArray(n)
    first = IntArray(n)
    save = IntArray(n)

    var nums = readln().split(" ").map { it.toInt() }

    repeat(n) {
        player[it] = nums[it]
        first[it] = nums[it]
    }

    nums = readln().split(" ").map { it.toInt() }

    repeat(n) {
        shuffle[it] = nums[it]
    }

    print(mix())
}

private fun mix(): Int {

    var cnt = 0

    while (!check()) {

        cnt++

        for (i in 0 until n) {
            save[i] = player[i]
        }

        for (i in 0 until n) {
            player[shuffle[i]] = save[i]
        }

        for (i in 0 until n) {

            if (first[i] != player[i]) break

            if (i == n - 1) return -1
        }
    }

    return cnt
}

private fun check(): Boolean {

    for (i in 0 until n) {
        if (player[i] != i % 3) {
            return false
        }
    }

    return true
}