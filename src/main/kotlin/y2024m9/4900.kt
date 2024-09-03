package y2024m9

private val code = arrayOf("063", "010", "093", "079", "106", "103", "119", "011", "127", "107")

fun main() {
    val sb = StringBuilder()

    while (true) {
        val input = readln()

        if (input == "BYE") break

        val (a, b) = input.dropLast(1).split("+").map { it.chunked(3) }
        sb.append(input).append(toCode(toInt(a) + toInt(b))).append("\n")
    }

    print(sb)
}

private fun toInt(arr: List<String>): Int {
    return arr.fold(0) { acc, str -> acc * 10 + code.indexOf(str) }
}

private fun toCode(n: Int): String {
    return n.toString().map { digit -> code[digit - '0'] }.joinToString("")
}