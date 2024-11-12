package y2024m11

fun main() {
    val (n, m) = input()
    val wait = input()
    val friends = input()
    val check = BooleanArray(n + 1)

    for (i in 1 .. m) {
        check[wait[i - 1]] = true
    }

    print(friends.count { !check[it] })
}

private fun input(): List<Int> {
    return readln().split(" ").map { it.toInt() }
}