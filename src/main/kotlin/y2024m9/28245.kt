package y2024m9

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val m = readln().toLong()
        val p = find(m)
        sb.append("${p.first} ${p.second}").append("\n")
    }

    print(sb)
}

private fun find(n: Long): Pair<Int, Int> {
    if (n.countOneBits() <= 2) {
        return if (n == 1L) Pair(0, 0)
        else findIdx(n)
    }

    val binary = n.toString(2)
    val mapped = binary.mapIndexedNotNull { index, c -> if (c == '1') binary.length - index - 1 else null }
    val p =  Pair(mapped[0], mapped[1])

    val a = (1L shl p.first) + (1L shl p.second)
    val b = (1L shl p.first) + (1L shl (p.second + 1))

    return if (n - a <= b - n) {
        Pair(p.second, p.first)
    } else {
        Pair(p.second + 1, p.first)
    }
}

private fun findIdx(n: Long): Pair<Int, Int> {
    val binary = n.toString(2).reversed()
        .mapIndexedNotNull { index, c -> if (c == '1') index else null }

    return when (binary.size) {
        1 -> Pair(binary[0] - 1, binary[0] - 1)
        else -> Pair(binary[0], binary[1])
    }
}