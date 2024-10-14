package y2024m10

import kotlin.math.pow

private val directions = listOf(7, 3, 1, 5)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln().split(" ").map { it.toInt() } }
    val magic = Array(m) { readln().split(" ").map { it.toInt() } }
    val beads = ArrayList<Int>()
    val ans = IntArray(3)

    var (x, y) = (n / 2) to (n / 2)
    var a = 1
    beads.add(0)

    while (true) {
        for (i in 0 until a) {
            x--
            if (x == 0 && y == 0) break
            add(beads, map[y][x])
        }

        if (x == 0 && y == 0) break

        for (i in 0 until a) {
            y++
            add(beads, map[y][x])
        }

        for (i in 0 until a + 1) {
            x++
            add(beads, map[y][x])
        }

        for (i in 0 until a + 1) {
            y--
            add(beads, map[y][x])
        }

        a += 2
    }

    for ((d, s) in magic) {
        remove(beads, directions[d - 1], s)

        while (true) {
            if (!bomb(beads, ans)) break
        }

        increase(beads, n)
    }

    print((ans[0] * 1) + (ans[1] * 2) + (ans[2] * 3))
}

private fun add(beads: ArrayList<Int>, n: Int) {
    if (n != 0) beads.add(n)
}

private fun remove(beads: ArrayList<Int>, v: Int, s: Int) {
    if (s == 1) {
        if (v < beads.size) beads.removeAt(v)
    } else {
        val idx = (v * s) + ((s * 2 - 1).toDouble().pow(2)).toInt() - 1
        if (idx < beads.size) beads.removeAt(idx)
        remove(beads, v, s - 1)
    }
}

private fun bomb(beads: ArrayList<Int>, ans: IntArray): Boolean {
    var n = -1
    var cnt = 0
    var idx = 0
    val rm = ArrayList<Pair<Int, Int>>()
    var check = false

    for (i in 1 until beads.size) {
        if (n == beads[i]) {
            cnt++
        } else {
            if (cnt >= 4) {
                check = true
                ans[n - 1] += cnt
                rm.add(idx to cnt)
            }

            n = beads[i]
            cnt = 1
            idx = i
        }
    }

    if (cnt >= 4) {
        check = true
        ans[n - 1] += cnt
        rm.add(idx to cnt)
    }

    rm.reverse()

    for ((i, c) in rm) {
        repeat(c) {
            beads.removeAt(i)
        }
    }

    return check
}

private fun increase(beads: ArrayList<Int>, size: Int) {
    val newBeads = ArrayList<Int>()
    newBeads.add(0)

    var n = -1
    var cnt = 0

    for (i in 1 until beads.size) {
        if (n == beads[i]) {
            cnt++
        } else {
            if (cnt != 0 && n != -1) {
                if (newBeads.size < size * size) newBeads.add(cnt)
                if (newBeads.size < size * size) newBeads.add(n)
            }

            n = beads[i]
            cnt = 1
        }
    }

    if (cnt != 0 && n != -1) {
        if (newBeads.size < size * size) newBeads.add(cnt)
        if (newBeads.size < size * size) newBeads.add(n)
    }

    beads.clear()
    beads.addAll(newBeads)
}