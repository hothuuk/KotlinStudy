package y2024m9

fun main() {
    val s = readln()
    val t = readln()

    var cur = t

    while (cur.length > s.length) {
        cur = if (cur.last() == 'A') {
            cur.dropLast(1)
        } else {
            cur.dropLast(1).reversed()
        }
    }

    print(if (cur == s) 1 else 0)
}