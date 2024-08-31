package y2024m8

fun main() {
    while (true) {
        val input = readLine() ?: break

        if (input == "") {
            break
        }

        val (n, s) = input.split(" ").map { it.toInt() }
        println(s / (n + 1))
    }
}