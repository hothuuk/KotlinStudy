package y2024m9

fun main() {
    val inputs = Array(3) { readln() }
    var n = 0

    for (i in 0 until 3) {
        val input = inputs[i]

        if (isInteger(input)) {
            n = input.toInt() + 3 - i
        }
    }

    val answer = if (n % 3 == 0 && n % 5 == 0) {
        "FizzBuzz"
    } else if (n % 3 == 0) {
        "Fizz"
    } else if (n % 5 == 0) {
        "Buzz"
    } else {
        n
    }

    print(answer)
}

private fun isInteger(str: String): Boolean {
    return str.toIntOrNull() != null
}