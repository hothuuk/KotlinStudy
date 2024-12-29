package y2024m12

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = b - a

    if (c <= 0) {
        print("Congratulations, you are within the speed limit!")
    } else {
        val f: Int

        when {
            c in 1 .. 20 -> f = 100
            c in 21 .. 30 -> f = 270
            else -> f = 500
        }

        print("You are speeding and your fine is \$$f.")
    }
}