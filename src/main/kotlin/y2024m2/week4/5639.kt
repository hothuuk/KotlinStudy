package y2024m2.week4

import java.io.BufferedReader
import java.io.InputStreamReader

private val sb = StringBuilder()

private data class Node(val value: Int, var left: Node?, var right: Node?) {

    fun addNode(n: Int) {
        if (n > value) {
            if (right == null) right = Node(n, null, null)
            else right!!.addNode(n)
        } else {
            if (left == null) left = Node(n, null, null)
            else left!!.addNode(n)
        }
    }
}

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val root = Node(br.readLine().toInt(), null, null)

    while (true) {
        val input: String = br.readLine() ?: break
        if (input == "") break
        val n = input.toInt()
        root.addNode(n)
    }

    postOrder(root)
    print(sb)
}

private fun postOrder(node: Node?) {

    if (node != null) {
        postOrder(node.left)
        postOrder(node.right)
        sb.append(node.value).append("\n")
    }
}