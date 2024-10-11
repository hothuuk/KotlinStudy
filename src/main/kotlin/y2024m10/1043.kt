package y2024m10

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val truths = readln().split(" ").map { it.toInt() }.drop(1).toHashSet()
    val parties = Array(m) { readln().split(" ").map { it.toInt() }.drop(1) }

    val tps = truths.toMutableSet()
    val visited = BooleanArray(m)
    var updated = true

    while (updated) {
        updated = false

        for (i in parties.indices) {
            if (!visited[i] && parties[i].any { it in tps }) {
                tps.addAll(parties[i])
                visited[i] = true
                updated = true
            }
        }
    }

    print(visited.count { !it })
}