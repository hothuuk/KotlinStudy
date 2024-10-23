package y2024m10

fun main() {
    val target = readln()
    val n = readln().toInt()
    var cnt = 0

    repeat(n) {
        val ring = readln()

        if (ring.contains(target)) {
            cnt++
        } else {
            var tmp = ring
            var ch = tmp[0]
            tmp = tmp.drop(1) + ch

            while(tmp != ring) {
                if (tmp.contains(target)) {
                    cnt++
                    break
                }

                ch = tmp[0]
                tmp = tmp.drop(1) + ch
            }
        }
    }

    print(cnt)
}