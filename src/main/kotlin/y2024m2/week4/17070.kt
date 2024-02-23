package y2024m2.week4

private var n = 0
private var cnt = 0

private lateinit var map: Array<IntArray>

enum class Direction {
    STRAIGHT, BOTTOM, DIAGONAL
}

fun main() {
    n = readln().toInt()

    map = Array(n) { IntArray(n) }

    repeat(n) { i ->
        val nums = readln().split(" ").map { it.toInt() }.toIntArray()
        map[i] = nums
    }

    dfs(1, 0, Direction.STRAIGHT)

    print(cnt)
}

fun dfs(x: Int, y: Int, direction: Direction) {

    if (x >= n || y >= n || map[y][x] == 1 ||
        (direction == Direction.DIAGONAL && (map[y - 1][x] == 1 || map[y][x - 1] == 1))
    ) return

    if (x == n - 1 && y == n - 1) {
        cnt++
        return
    }

    when(direction) {
        Direction.STRAIGHT -> {
            dfs(x + 1, y, Direction.STRAIGHT)
            dfs(x + 1, y + 1, Direction.DIAGONAL)
        }

        Direction.BOTTOM -> {
            dfs(x, y + 1, Direction.BOTTOM)
            dfs(x + 1, y + 1, Direction.DIAGONAL)
        }

        Direction.DIAGONAL -> {
            dfs(x + 1, y, Direction.STRAIGHT)
            dfs(x, y + 1, Direction.BOTTOM)
            dfs(x + 1, y + 1, Direction.DIAGONAL)
        }
    }
}