package y2024m10

private val v = setOf('a', 'e', 'i', 'o', 'u')

fun main() {
    val sb = StringBuilder()

    while (true) {
        val str = readln()

        if (str == "#") break

        sb.append(str.count { v.contains(it.lowercaseChar()) }).append("\n")
    }

    print(sb)
}