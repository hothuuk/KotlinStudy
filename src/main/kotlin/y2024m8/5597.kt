package y2024m8

private const val N = 30

fun main() {
    val students = BooleanArray(N + 1)

    repeat(N - 2) {
        students[readln().toInt()] = true
    }

    students.forEachIndexed { index, attendance ->
        if (index != 0 && !attendance) {
            println(index)
        }
    }
}