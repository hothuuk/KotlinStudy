package y2024m2.week5

private lateinit var star: Array<Array<Char>>

fun main() {
    val n = readln().toInt()

    star = Array(n) { Array(n * 2 - 1) {' '} }

    division(0, 0, n)

    print(star.joinToString("\n") { it.joinToString("") })
}

private fun division(x: Int, y: Int, n: Int) {
    if (n == 3) {
        star(x, y)
    } else {
        division(x + (3 * (n / 6)), y, n / 2)
        division(x, y + (3 * (n / 6)), n / 2)
        division(x + ((3 * 2) * (n / 6)), y + (3 * (n / 6)), n / 2)
    }
}

private fun star(x: Int, y: Int) {

    for (i in x until x + 3) {
        if (i == x + 2) {
            star[y][i] = '*'
        }
    }

    var n = 0

    for (i in x until x + 4) {
        if (n % 2 == 1) {
            star[y + 1][i] = '*'
        }
        n++
    }

    for (i in x until x + 5) {
        star[y + 2][i] = '*'
    }
}