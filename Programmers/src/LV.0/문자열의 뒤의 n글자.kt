package LV.`0`

fun main() {
    println(solution1("ProgrammerS123", 11))
}

fun solution1(my_string: String, n: Int): String = my_string.substring(my_string.length - n)