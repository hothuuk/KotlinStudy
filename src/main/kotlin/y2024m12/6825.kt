package y2024m12

fun main() {
    val w = readln().toDouble()
    val h = readln().toDouble()
    val bmi = w / (h * h)

    when {
        bmi > 25.0 -> print("Overweight")
        bmi in 18.5 .. 25.0 -> print("Normal weight")
        else -> print("Underweight")
    }
}