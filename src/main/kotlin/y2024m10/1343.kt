package y2024m10

fun main() {
    val boards = readln().split(".")
    val sb = StringBuilder()

    for (board in boards) {
        val l = board.length
        sb.append(".")

        if (l % 4 == 0) {
            sb.append("A".repeat(l))
        } else if (l % 4 == 2) {
            sb.append("A".repeat(l - 2)).append("BB")
        } else {
            print(-1)
            return
        }
    }

    print(sb.drop(1))
}