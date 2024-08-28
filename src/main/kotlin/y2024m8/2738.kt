package y2024m8

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr1 = Array(n) { IntArray(m) { 0 } }
    val arr2 = Array(n) { IntArray(m) { 0 } }

    insert(arr1, n, m)
    insert(arr2, n, m)

    val answer = Array(n) { IntArray(m) { 0 } }

    for (i in 0 until n) {
        for (j in 0 until m) {
            answer[i][j] = arr1[i][j] + arr2[i][j]
        }
    }

    answer.map { println(it.joinToString(" ")) }
}

private fun insert(arr: Array<IntArray>, n: Int, m: Int) {
    for (i in 0 until n) {
        val input = readln().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            arr[i][j] = input[j]
        }
    }
}