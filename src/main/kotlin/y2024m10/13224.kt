package y2024m10

fun main() {
    val moves = readln()
    val chopCup = BooleanArray(3)
    chopCup[0] = true

    for (move in moves) {
        val (a, b) = when(move) {
            'A' -> 0 to 1
            'B' -> 1 to 2
            'C' -> 0 to 2
            else -> 0 to 0
        }

        val tmp = chopCup[a]
        chopCup[a] = chopCup[b]
        chopCup[b] = tmp
    }

    chopCup.mapIndexed { idx, b -> if (b) print(idx + 1) }
}