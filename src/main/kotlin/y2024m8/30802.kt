package y2024m8

fun main() {
    val n = readln().toInt()
    val sizes = readln().split(" ").map { it.toInt() }
    val (t, p) = readln().split(" ").map { it.toInt() }

    val tBundle = sizes.sumOf { (it + t - 1) / t }
    val pBundle = n / p
    val pens = n % p

    print("$tBundle\n$pBundle $pens")
}