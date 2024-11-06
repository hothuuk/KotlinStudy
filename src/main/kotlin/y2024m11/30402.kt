package y2024m11

fun main() {
    val picture = Array(15) { readln().split(" ") }

    for (i in 0 until 15) {
        for (j in 0 until 15) {
            when (picture[i][j]) {
                "w" -> {
                    print("chunbae")
                    return
                }
                "b" -> {
                    print("nabi")
                    return
                }
                "g" -> {
                    print("yeongcheol")
                    return
                }
            }
        }
    }
}