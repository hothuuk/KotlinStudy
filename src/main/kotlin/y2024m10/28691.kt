package y2024m10

fun main() {
    var a = ""

    when(readln()) {
        "M" -> a = "MatKor"
        "W" -> a = "WiCys"
        "C" -> a = "CyKor"
        "A" -> a = "AlKor"
        "$" -> a = "\$clear"
    }

    print(a)
}