package y2024m10

fun main() {
    val s = readln()
    val cnt = IntArray(2)
    var cur = s[0]
    var prev = ' '

    for (i in 1 until s.length) {
        val next = s[i]

        if (cur != next) {
            cnt[cur - '0']++
            prev = cur
            cur = next
        }
    }

    if (cur != prev && prev != ' ') {
        cnt[cur - '0']++
    }

    print(cnt.min())
}