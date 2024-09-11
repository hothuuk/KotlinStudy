package y2024m9

private data class Submit(var right: Int = 0, var fail: Int = 0)

fun main() {
    val n = readln().toInt()
    val grading = HashMap<String, Submit>()

    repeat(n) {
        val submit = readln().split(" ")
        val id = submit[1]
        val result = submit[2].toInt()

        if (id != "megalusion")  {
            grading.computeIfAbsent(id) { Submit() }

            if (result == 4) {
                grading[id]!!.right += 1
            } else if (grading[id]!!.right < 1) {
                grading[id]!!.fail++
            }
        }
    }

    var right = 0.0
    var total = 0.0

    for (g in grading) {
        val r = g.value.right
        val f = g.value.fail

        if (r >= 1) {
            right += 1
            total += 1 + f
        }
    }

    if (right == 0.0) {
        print(0)
        return
    }

    print((right / total) * 100)
}