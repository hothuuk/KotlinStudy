package day2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr1 = Array(n) {0}
    val arr2 = Array(n) {0}
    val check = ArrayList<Int>()
    var sum = 0
    var index = 0
    var tmp:Int
    var saveIndex:Int

    for (i in 1..n) {
        arr1[i - 1] = sc.nextInt()
    }

    for (i in 1..n) {
        arr2[i - 1] = sc.nextInt()
    }

    for (i in 1..n) {
        var min = 101
        var max = -1

        for (j in 1..n) {
            if (!check.contains(j - 1)) {
                if (arr2[j - 1] > max) {
                    max = arr2[j - 1]
                    index = j - 1
                }
            }
        }

        check.add(index)
        saveIndex = index

        for (j in 1..n) {
            if (!check.contains(j - 1)) {
                if (arr1[j - 1] < min) {
                    min = arr1[j - 1]
                    index = j - 1
                }
            }
        }

        if (min != arr1[saveIndex]) {
            tmp = arr1[index]
            arr1[index] = arr1[saveIndex]
            arr1[saveIndex] = tmp
        }

        println("max = $max, min = $min, index = $index, saveIndex = $saveIndex")
        for (j in 1..n) {
            print("${arr1[j - 1]} ")
        }
        println("\n")
    }

    for (i in 1..n) {
        sum += arr1[i - 1] * arr2[i - 1]
    }

    print(sum)
}