package y2024m10

fun main() {
    val n = readln().toInt()
    val map = HashMap<String, Int>()

    repeat(n) {
        val s = readln()
        map[s] = map.getOrDefault(s, 0) + 1
    }

    val sortedMap = map.entries
        .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
        .associate { it.key to it.value }

    print(sortedMap.entries.first().key)
}