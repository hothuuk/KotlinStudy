package y2024m9

fun main() {
    val g = readln().toInt()
    val p = readln().toInt()
    val gates = IntArray(g + 1) { it }

    var cnt = 0

    fun findGate(x: Int): Int {
        if (gates[x] == x) return x
        gates[x] = findGate(gates[x])
        return gates[x]
    }

    for (i in 0 until p) {
        val plane = readln().toInt()
        val gate = findGate(plane)

        if (gate == 0) break

        gates[gate] = gate - 1
        cnt++
    }

    print(cnt)
}
