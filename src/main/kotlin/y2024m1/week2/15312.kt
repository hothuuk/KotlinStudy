package y2024m1.week2

fun main() {
    val arr = arrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
    val a = readln()
    val b = readln()
    val st = ArrayList<Int> ()

    for (i in a.indices) {
        st += arr[a[i].code - 65]
        st += arr[b[i].code - 65]
    }

    val n = st.size - 2

    repeat (n) {
        for (i in 0 until st.size - 1) {
            val sum = st[i] + st[i + 1]
            st[i] = if (sum >= 10) {
                sum - 10
            } else sum
        }
    }

    print("${st[0]}${st[1]}")
}