package y2024m1.week4

import kotlin.math.roundToInt

fun main() {
    val num = readln().toInt()

    val array = IntArray(num)
    val map = HashMap<Int,Int>()
    var sum = 0.0
    var count = -1
    var index = -1

    for(i in 0 until  num){
        array[i] = readln().toInt()
        map[array[i]] = map.getOrDefault(array[i],0) + 1
        sum +=array[i]
    }

    array.sort()

    val average = (sum / num).roundToInt()

    println(average)

    println(array[num/2])

    var check = false

    for(i in map.keys.sorted()) {
        if (map[i]!! > count) {
            count = map[i]!!
            index = i
            check = false
        } else if (map[i] == count && !check){
            index = i
            check =true
        }
    }

    println(index)

    if (array.size == 1) {
        println(0)
    } else {
        println(array[num - 1] - array[0])
    }
}
