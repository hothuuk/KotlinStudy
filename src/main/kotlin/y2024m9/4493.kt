package y2024m9

fun main() {
    val sb = StringBuilder()

    repeat(readln().toInt()) {
        var p1s = 0
        var p2s = 0

        repeat(readln().toInt()) {
            val (p1, p2) = readln().split(" ")

            when(p1) {
                "R" -> {
                    when(p2) {
                        "S" -> p1s++
                        "P" -> p2s++
                    }
                }
                "S" -> {
                    when(p2) {
                        "P" -> p1s++
                        "R" -> p2s++
                    }
                }
                "P" -> {
                    when(p2) {
                        "R" -> p1s++
                        "S" -> p2s++
                    }
                }
            }

        }

        if (p1s == p2s) {
            sb.append("TIE\n")
        } else {
            sb.append(if (p1s > p2s) "Player 1" else "Player 2").append("\n")
        }
    }

    print(sb)
}