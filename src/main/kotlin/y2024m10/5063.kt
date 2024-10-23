package y2024m10

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val (r, e, c) = readln().split(" ").map { it.toInt() }
        val a = e - c

        if (r < a) {
            sb.append("advertise\n")
        } else if (r == a) {
            sb.append("does not matter\n")
        } else {
            sb.append("do not advertise\n")
        }
    }

    print(sb)
}