package y2024m8

fun main() {
    val promise = arrayOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )

    val n = readln().toInt()
    var check = false

    repeat(n) {
        val str = readln()
        if (!promise.contains(str)) check = true
    }

    print(if (check) "Yes" else "No")
}