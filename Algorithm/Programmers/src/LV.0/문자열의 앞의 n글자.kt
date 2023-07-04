package LV.`0`

fun main() {
    println(solution2("ProgrammerS123", 11))
}

fun solution2(my_string: String, n: Int): String = my_string.slice(0 until n)