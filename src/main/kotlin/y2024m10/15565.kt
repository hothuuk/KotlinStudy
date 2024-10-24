package y2024m10

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val dolls = readln().split(" ").map { it.toInt() }.toIntArray()

    var r = init(dolls, k)

    if (r == -1) {
        print(-1)
        return
    }

    var l = 0
    var size = Integer.MAX_VALUE

    while (r < dolls.size) {
        if (dolls[l] != 1) {
            l++
        }

        if (dolls[r] != 1){
            r++
            if (r == dolls.size) break
        }

        if (dolls[l] == 1 && dolls[r] == 1) {
            size = minOf(size, r - l + 1)
            r++
            l++
        }
    }

    print(size)
}

private fun init(dolls: IntArray, k: Int): Int {
    var cnt = 0

    for (i in dolls.indices) {
        if (dolls[i] == 1) cnt++
        if (cnt == k) return i
    }

    return -1
}