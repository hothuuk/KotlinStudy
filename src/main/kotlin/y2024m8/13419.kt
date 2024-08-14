package y2024m8

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val str = readln()

        if (str.length == 1) {
            println("$str\n$str")
        } else {
            tang(str, 0)
            tang(str, 1)
        }
    }
}

private fun tang(str: String, n: Int) {
    var speak = ""
    var index = n

    while (true) {
        if (speak.contains(str[index])) break

        speak += str[index]
        index += 2

        if (index >= str.length) {
            index -= str.length
        }
    }

    println(speak)
}