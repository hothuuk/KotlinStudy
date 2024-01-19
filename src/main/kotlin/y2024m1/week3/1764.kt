package y2024m1.week3

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val name = HashMap<String, Int> ()
    val dup = ArrayList<String> ()

    repeat(n) {
        name.put(readln(), 1)
    }

    repeat(m) {
        val str = readln()
        if (name.contains(str)) {
            dup.add(str)
        }
    }

    dup.sort()

    println(dup.size)
    dup.forEach {
        println(it)
    }
}