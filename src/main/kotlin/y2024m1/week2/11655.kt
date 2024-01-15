package y2024m1.week2

fun main() {
    val str = readln()
    var answer = ""

    for (element in str) {
        if (element.code in 48..57) {
            answer += element
        } else if (element.code in 65 .. 90) {
            answer += if (element.code + 13 > 90) {
                Char(element.code - 13)
            } else {
                Char(element.code + 13)
            }
        } else if (element.code in 97 .. 122) {
            answer += if (element.code + 13 > 122) {
                Char(element.code - 13)
            } else {
                Char(element.code + 13)
            }
        } else answer += " "
    }

    print(answer)
}