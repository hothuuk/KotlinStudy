package y2024m2.week3

var count = 0
val list = ArrayList<Node>()

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ")
    val remove = readln().toInt()

    var root = 0

    for (i in 0 until n) {
        list.add(Node(i == remove, i))
    }

    for (i in 0 until n) {
        if (arr[i].toInt() != -1) {
            list[arr[i].toInt()].children.add(list[i])
        } else {
            root = i
        }
    }

    dfs(root)

    println(count)
}

fun dfs(position: Int) {

    val parent = list[position]

    if (!parent.remove) {
        if (parent.children.size != 0) {
            if (parent.children.size == 1 && parent.children[0].remove) {
                count++
            } else {
                for (node in parent.children) {
                    dfs(node.position)
                }
            }
        } else {
            count++
        }
    }
}

data class Node(val remove: Boolean, val position: Int) {
    val children = ArrayList<Node>()
}
