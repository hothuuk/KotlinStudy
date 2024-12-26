package y2024m12

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val subjects = ArrayList<Pair<String, Int>>()

    repeat(n) {
        val (s, p) = readln().split(" ")
        subjects.add(s to p.toInt())
    }

    val publicSubjects = HashSet<String>()

    repeat(k) {
        publicSubjects.add(readln())
    }

    val others = ArrayList<Int>()
    var defaultPoint = 0

    for ((name, point) in subjects) {
        if (!publicSubjects.contains(name)) {
            others.add(point)
        } else {
            defaultPoint += point
        }
    }

    others.sort()

    val t = m - k
    var min = defaultPoint
    var max = defaultPoint

    for (i in 0 until t) {
        min += others[i]
        max += others[others.size - i - 1]
    }

    print("$min $max")
}