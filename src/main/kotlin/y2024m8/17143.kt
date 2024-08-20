package y2024m8

private val directions = arrayOf(
    Pair(0, -1), // 위 0
    Pair(0, 1), // 아래 1
    Pair(1, 0), // 오른쪽 2
    Pair(-1, 0) // 왼쪽 3
)

private data class Shark(val speed: Int, var direction: Int, val size: Int)

fun main() {
    val (r, c, m) = readln().split(" ").map { it.toInt() }
    val map = Array(r + 1) { Array(c + 1) { ArrayList<Shark>() } }

    repeat(m) {
        val (y, x, s, d, z) = readln().split(" ").map { it.toInt() }
        map[y][x].add(Shark(s, d - 1, z))
    }

    var total = 0

    for (x in 1 .. c) {
        for (y in 1 .. r) {
            if (map[y][x].isNotEmpty()) {
                total += map[y][x][0].size
                map[y][x].clear()
                break
            }
        }

        move(map, r, c)
    }

    print(total)
}

private fun move(map: Array<Array<ArrayList<Shark>>>, r: Int, c: Int) {
    val newMap = Array(r + 1) { Array(c + 1) { ArrayList<Shark>() } }

    for (y in 1 .. r) {
        for (x in 1 .. c) {
            if (map[y][x].isEmpty()) continue

            val shark = map[y][x][0]
            var (direction, speed) = shark.direction to shark.speed
            var (nx, ny) = x to y

            val maxRange = if (direction >= 2) c else r
            speed %= (maxRange - 1) * 2

            repeat(speed) {
                val (dx, dy) = directions[direction]
                nx += dx
                ny += dy

                if (direction >= 2) {
                    if (nx < 1) {
                        nx = 2
                        direction = 2
                    } else if (nx > c) {
                        nx = c - 1
                        direction = 3
                    }
                }

                if (direction < 2) {
                    if (ny < 1) {
                        ny = 2
                        direction = 1
                    } else if (ny > r) {
                        ny = r - 1
                        direction = 0
                    }
                }
            }

            shark.direction = direction
            newMap[ny][nx].add(shark)
        }
    }

    for (y in 1 .. r) {
        for (x in 1 .. c) {
            if (newMap[y][x].size > 1) {
                val largestShark = newMap[y][x].maxBy { it.size }
                newMap[y][x].clear()
                newMap[y][x].add(largestShark)
            }
        }
    }

    for (y in 1 .. r) {
        for (x in 1 .. c) {
            map[y][x].clear()
            map[y][x].addAll(newMap[y][x])
        }
    }
}