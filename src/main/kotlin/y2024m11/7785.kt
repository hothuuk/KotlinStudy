package y2024m11

fun main() {
    val company = HashSet<String>()

    repeat(readln().toInt()) {
        val (name, type) = readln().split(" ")

        if (type == "enter") {
            company.add(name)
        } else {
            company.remove(name)
        }
    }

    print(company.sortedDescending().joinToString("\n"))
}