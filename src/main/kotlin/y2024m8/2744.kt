package y2024m8

fun main() {
    val str = readln().toMutableList()

    for (i in 0 until str.size) {
        if (str[i].isUpperCase()) {
            str[i] = str[i].lowercaseChar()
        } else {
            str[i] = str[i].uppercaseChar()
        }
    }

    print(str.joinToString(""))
}