package y2024m3.week1

private data class Info(var a: Int, var b: Int, var c: Int)

fun main() {
    val input1 = readln().split(" ")
    val input2 = readln().split(", ")

    val friends = Array(input1.size) {""}
    val gifts = Array(input2.size) {""}

    for (i in input1.indices) {
        friends[i] = input1[i]
    }

    for (i in input2.indices) {
        gifts[i] = input2[i]
    }

    print(solution(friends, gifts))
}

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    var answer = 0

    val size = friends.size
    val table = Array(size) { Array(size) {0} }

    for (gift in gifts) {
        val (sender, recipient) = gift.split(" ")

        for (i in 0 until size) {
            if (friends[i] != sender) continue

            for (j in 0 until size) {
                if (friends[j] != recipient) continue

                table[i][j]++
                break
            }

            break
        }
    }

    val info = Array(size) {Info(0, 0, 0)}

    for (i in 0 until size) {
        for (j in 0 until size) {
            info[i].a += table[i][j]
            info[j].b += table[i][j]
        }
    }

    for (i in 0 until size) {
        info[i].c = info[i].a - info[i].b
    }

    val giftCnt = IntArray(size)

    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i == j) continue

            if (table[i][j] > table[j][i]) giftCnt[i]++

            if (table[i][j] == table[j][i]) {
                if (info[i].c > info[j].c) giftCnt[i]++
            }
        }
    }

    answer = giftCnt.maxOf { it }

    return answer
}