package y2024m1.week3

data class Info(val roomA: Int, val roomB: Int, val dis: Int)
data class Ant(var locate: Int, var energy: Int)

fun main() {
    val n = readln().toInt()
    val ants = List(n) { Ant(it + 1, readln().toInt())}
    val room = List(n - 1) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        Info(a, b, c)
    }
    val answer = IntArray(n)

    repeat(n) {
        search(it, ants, room)
        answer[it] = ants[it].locate
    }

    answer.forEach { println(it) }
}

fun search(idx: Int, ants: List<Ant>, room: List<Info>){

    if (ants[idx].locate == 1) {
        return
    }

    for (i in room.indices) {
        if (ants[idx].locate == room[i].roomB && ants[idx].energy >= room[i].dis) {
            ants[idx].energy -= room[i].dis
            ants[idx].locate = room[i].roomA
            search(idx, ants, room)
        }
    }
}