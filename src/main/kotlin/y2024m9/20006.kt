package y2024m9

private class Room(
    var size: Int,
    val players: ArrayList<Pair<Int, String>>,
    val levelLimit: Pair<Int, Int>,
    var isStarted: Boolean
)

fun main() {
    val (p, m) = readln().split(" ").map { it.toInt() }
    val rooms = ArrayList<Room>()

    repeat(p) {
        val input = readln().split(" ")
        val level = input[0].toInt()
        val name = input[1]

        var room = searchRoom(rooms, level)

        if (room == null) {
            room = createRoom(level)
            rooms.add(room)
        }

        room.players.add(Pair(level, name))
        room.size++

        if (room.size >= m) room.isStarted = true
    }

    sortPlayers(rooms)

    val sb = StringBuilder()

    for (room in rooms) {
        sb.append(if (room.isStarted) "Started!" else "Waiting!").append("\n")

        for (player in room.players) {
            sb.append("${player.first} ${player.second}").append("\n")
        }
    }

    print(sb)
}

private fun createRoom(level: Int): Room {
    return Room(0,
        ArrayList(),
        Pair(maxOf(1, level - 10), minOf(500, level +10)),
        false
    )
}

private fun searchRoom(rooms: ArrayList<Room>, level: Int): Room? {
    for (room in rooms) {
        if (room.isStarted) continue

        val levelLimit = room.levelLimit
        if (level in levelLimit.first .. levelLimit.second) return room
    }

    return null
}

private fun sortPlayers(rooms: ArrayList<Room>) {
    for (room in rooms) {
        room.players.sortBy { it.second }
    }
}