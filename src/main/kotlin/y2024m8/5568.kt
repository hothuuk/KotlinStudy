package y2024m8

private lateinit var cards: Array<String>
private lateinit var visited: Array<Boolean>
private lateinit var answer: HashSet<String>

private var n = 0

fun main() {
    n = readln().toInt()
    val k = readln().toInt()

    cards = Array(n) { "" }
    visited = Array(n) { false }
    answer = HashSet()

    for (i in 0 until n) {
        cards[i] = readln()
    }

    back(k, "")

    print(answer.size)
}

private fun back(cnt: Int, num: String) {
    if (cnt == 0) {
        answer.add(num)
        return
    }

    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            back(cnt - 1, num + cards[i])
            visited[i] = false
        }
    }
}