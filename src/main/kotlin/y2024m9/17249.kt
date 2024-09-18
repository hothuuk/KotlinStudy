package y2024m9

fun main() {
    val (l, r) = readln().split("(^0^)")
    print("${count(l)} ${count(r)}")
}

private fun count(str: String): Int {
    return str.count { it == '@' }
}