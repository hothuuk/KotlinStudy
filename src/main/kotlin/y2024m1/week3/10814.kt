package y2024m1.week3

import java.util.Scanner

data class Person(var age : Int, var name : String)

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val user = Array<Person?>(n) {null}

    repeat(n) {
        val a = next().toInt()
        val b = next()
        val person = Person(a, b)
        user[it] = person
    }

    user.sortBy { it?.age }

    repeat(n) {
        println("${user[it]?.age} ${user[it]?.name}")
    }
}