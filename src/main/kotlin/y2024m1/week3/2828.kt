package y2024m1.week3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    val cnt = nextInt()
    var dis = 0
    var head = 1
    var tail = m

    repeat(cnt) {
        val apple = nextInt()
        var diss = 0

        if (apple < head) {
            diss = head - apple
            head -= diss
            tail -= diss
            dis += diss
        } else if (apple > tail) {
            diss = apple - tail
            head += diss
            tail += diss
            dis += diss
        }
    }

    print(dis)
}