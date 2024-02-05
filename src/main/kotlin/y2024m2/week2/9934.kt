package y2024m2.week2

private lateinit var answer: Array<ArrayList<String>>

private var deep = 0

fun main() {
    deep = readln().toInt()

    val nodes = readln().split(" ")

    if (deep == 1) {
        print(nodes)
        return
    }

    answer = Array(deep) {ArrayList() }

    val middle = nodes[nodes.size / 2]

    answer[0].add(middle)

    val left = nodes.subList(0, nodes.size / 2)
    val right = nodes.subList(nodes.size / 2 + 1, nodes.size)

    foundLeaf(left, right, 1)

    for (i in 0 until deep) {
        answer[i].forEach { print("$it ") }
        println()
    }
}

fun foundLeaf(left: List<String>, right: List<String>, cur: Int) {

    if (deep == cur + 1) {
        answer[cur].add(left[0])
        answer[cur].add(right[0])
        return
    }

    val leftMiddle = left[left.size / 2]
    val rightMiddle = right[right.size / 2]

    answer[cur].add(leftMiddle)
    answer[cur].add(rightMiddle)

    val leftLeaf = left.subList(0, left.size / 2)
    val leftLeaf2 = left.subList(left.size / 2 + 1, left.size)
    val rightLeaf = right.subList(0, right.size / 2)
    val rightLeaf2 = right.subList(right.size / 2 + 1, right.size)

    foundLeaf(leftLeaf, leftLeaf2, cur + 1)
    foundLeaf(rightLeaf, rightLeaf2, cur + 1)
}