package y2023m12.day3

fun main() {

    var n:Int = readln().toInt()
    var stick = 64
    var cnt = 0

    fun divide() {
        if (n < stick) {
            stick /= 2
            divide()
        } else {
            n -= stick
            cnt++

            if (n == 0) {
                return
            }

            divide()
        }
    }

    divide()

    print(cnt)
}
