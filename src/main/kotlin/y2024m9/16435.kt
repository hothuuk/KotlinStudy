package y2024m9

fun main() {
    var (n, l) = readln().split(" ").map { it.toInt() }
    val fruits = readln().split(" ").map { it.toInt() }.toMutableList()

    while (true) {
        if (fruits.isNotEmpty() && fruits.min() <= l) {
            l++
            fruits.remove(fruits.min())
        } else {
            break
        }
    }

    print(l)
}