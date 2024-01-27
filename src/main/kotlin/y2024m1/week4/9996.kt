package y2024m1.week4

fun main() {
    val n = readln().toInt()
    val (key1, key2) = readln().split("*")

    for (i in 0 until n) {
        val str = readln()

        if (str.length < key1.length + key2.length) {
            println("NE")
            continue
        }

        val front = str.substring(0, key1.length)
        val back = str.substring(str.length - key2.length, str.length)

        if (front == key1 && back == key2) println("DA")
        else println("NE")
    }
}