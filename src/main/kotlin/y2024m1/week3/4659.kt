package y2024m1.week3

fun main() {

    val vowels = arrayOf('a', 'o', 'i', 'e', 'u')
    var save: Char? = null

    while (true) {
        val str = readln()
        var vowelChk = false
        var doubleChk = true
        var continueChk = true
        var same1 = 0
        var same2 = 0
        var dif: Int
        if (str == "end") return

        for (ch in str) {
            if (!vowelChk && vowels.contains(ch)) vowelChk = true

            if (save == null) save = ch
            else if (ch == save && ch != 'e' && ch != 'o') doubleChk = false
            else save = ch

            dif = if (vowels.contains(ch)) 0
            else 1

            if (dif == 0) {
                same2 = 0
                same1++
            } else {
                same1 = 0
                same2++
            }

            if (same1 + same2 >= 3) continueChk = false
        }


        if (vowelChk && doubleChk && continueChk) println("<$str> is acceptable.")
        else println("<$str> is not acceptable.")
    }
}