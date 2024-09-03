package y2024m9

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    fun draw(rows: Int, cols: Int) {
        repeat(rows) {
            repeat(cols) {
                sb.append("@")
            }
            sb.append("\n")
        }
    }

    draw(n, n * 5)
    draw(n, n)
    draw(n, n * 5)
    draw(n * 2, n)

    print(sb)
}