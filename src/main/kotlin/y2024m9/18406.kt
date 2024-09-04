package y2024m9

fun main() {
    val n = readln()
    val len = n.length / 2
    val (left, right) = n.chunked(len)

    var (ls, rs) = Pair(0, 0)

    for (i in 0 until len) {
        ls += left[i] - '0'
        rs += right[i] - '0'
    }

    print(if (ls == rs) "LUCKY" else "READY")
}