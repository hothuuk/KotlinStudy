package y2024m2.week2

fun main() {
    val n = readln().toInt()
    val word = readln()

    val tail = word.lastIndex - if (word.length % 2 == 0) 0 else 1
    val set = mutableSetOf<String>().apply { add(word) }

    while (true) {
        val prev = set.last()
        val sb = StringBuilder()

        for (i in prev.indices step 2) sb.append(prev[i])

        for (i in tail downTo 0 step 2) sb.append(prev[i])

        if (!set.add(sb.toString())) break
    }

    print(set.toList()[n % set.size])
}