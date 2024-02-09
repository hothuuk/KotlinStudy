package y2024m2.week2

fun main() {
    val t = readln().toInt()

    val set = HashSet<Int>()
    val sb = StringBuilder()

    repeat(t) {
        val input = readln().split(" ")
        var num = 0

        if (input[0] != "all" && input[0] != "empty")
            num = input[1].toInt()

        when(input[0]) {
            "add" -> {
                set.add(num)
            }

            "remove" -> {
               if (set.contains(num)) {
                   set.remove(num)
               }
            }

            "check" -> {
                if (set.contains(num)) {
                    sb.append("1\n")
                } else {
                    sb.append("0\n")
                }
            }

            "toggle" -> {
                if (set.contains(num)) {
                    set.remove(num)
                } else {
                    set.add(num)
                }
            }

            "all" -> {
                set.clear()
                for (i in 1 .. 20) {
                    set.add(i)
                }
            }

            "empty" -> {
                set.clear()
            }
        }
    }

    print(sb)
}