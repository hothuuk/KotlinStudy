package y2024m8

fun main() {
    val n = readln().toInt()
    var answer = 1L

    repeat(n) {
        answer = (answer * 3L) % 1000000007L
    }

    print(answer - 1)
}