package y2024m9

fun main() {
    val l = readln().toInt()
    val str = readln()
    val bases = listOf('A', 'C', 'G', 'T')

    var cnt = 1L

    for (base in bases) {
        cnt = (cnt * str.count { it == base }) % 1000000007
    }

    print(cnt)
}