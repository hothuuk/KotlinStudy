package y2023m12.day5

fun main() {
    val n = readln().toInt()

    var answer = ""

    if (n == 1) {
        answer = readln()
        print(answer)
        return
    }

    val str = Array(n) {""}

    for (i in 0 until n) {
        str[i] = readln()
    }

    val len = str[0].length

    for (i in 0 until len) {

        var check = true
        val char1 = str[0][i]

        for (j in 0 until n) {
            val char2 = str[j][i]
            if (char1 != char2) check = false
        }

        if (check) answer += char1
        else answer += "?"
    }

    print(answer)
}
