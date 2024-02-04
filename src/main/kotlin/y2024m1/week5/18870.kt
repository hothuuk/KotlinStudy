package y2024m1.week5

fun main() = with(System.out.bufferedWriter()){

    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val arr = br.readLine().split(' ').map{it.toInt()}
    val sortedArr = arr.distinct().sorted()
    for(i in 0 until n){
        write("${sortedArr.binarySearch(arr[i])} ")
    }

    close()
}
