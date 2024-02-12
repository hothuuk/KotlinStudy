package y2024m2.week3

private val dna = arrayOf(
    arrayOf('A', 'C', 'A', 'G'),
    arrayOf('C', 'G', 'T', 'A'),
    arrayOf('A', 'T', 'C', 'G'),
    arrayOf('G', 'A', 'G', 'T')
)

fun main() {
    val n = readln().toInt()
    val str = readln()

    var len = n - 2
    var ch = str[len + 1]

    while (true) {

        if (len == -1) break

        var idx1 = -1
        var idx2 = -1

        when(str[len]) {
            'A' -> idx1 = 0
            'G' -> idx1 = 1
            'C' -> idx1 = 2
            'T' -> idx1 = 3
        }

        when(ch) {
            'A' -> idx2 = 0
            'G' -> idx2 = 1
            'C' -> idx2 = 2
            'T' -> idx2 = 3
        }

        ch = dna[idx1][idx2]
        len--
    }

    print(ch)
}