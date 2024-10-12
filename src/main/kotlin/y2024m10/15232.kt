package y2024m10

fun main() {
    val r = readln().toInt()
    val c = readln().toInt()

    repeat(r) {
        repeat(c) {
            print("*")
        }
        println()
    }
}