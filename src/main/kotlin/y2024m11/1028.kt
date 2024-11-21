package y2024m11

private data class Diamond(var l: Int, var r: Int)

fun main() {
    val (r, c) = readln().split(" ").map { it.toInt() }
    val inputs = Array(r) { readln() }
    val mine = Array(r) { IntArray(c) }
    val sums = Array(r) { Array(c) { Diamond(0,0) } }

    for (i in 0 until r) {
        val input = inputs[i]

        for (j in 0 until c) {
            mine[i][j] = input[j] - '0'
        }
    }

    for (i in 0 until r) {
        for (j in 0 until c) {
            if (mine[i][j] == 1) {
                var y = 1
                var lx = -1
                var rx = 1
                var lCheck = false
                var rCheck = false
                val diamond = Diamond(0, 0)

                while (true) {
                    diamond.l = lx
                    diamond.r = rx
                    val ny = i + y
                    val nlx = j + lx
                    val nrx = j + rx

                    if (ny in 0 until r) {
                        if (nlx !in 0 until c && nrx !in 0 until c) {
                            break
                        }

                        if (!lCheck && nlx in 0 until c) {
                            if (mine[ny][nlx] == 1) {
                                lx--
                            } else {
                                lCheck = true
                            }
                        }

                        if (!rCheck && nrx in 0 until c) {
                            if (mine[ny][nrx] == 1) {
                                rx++
                            } else {
                                rCheck = true
                            }
                        }
                    } else {
                        break
                    }

                    y++
                }

                sums[i][j] = diamond
            }
        }
    }

    var max = 0

    for (i in 0 until r) {
        for (j in 0 until c) {
            if (mine[i][j] == 1) {
                val min = minOf(-sums[i][j].l, sums[i][j].r)

                if (min <= max) continue

                for (size in min downTo 1) {
                    if (sums[i + size - 1][j - size + 1].r >= size &&
                        -sums[i + size - 1][j + size - 1].l >= size) {
                        max = maxOf(max, size)
                        break
                    }
                }
            }
        }
    }

    print(max)
}