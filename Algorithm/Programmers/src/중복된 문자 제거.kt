fun main() {
    println(solution4("people"))
}

fun solution4(my_string: String) = my_string.toSet().joinToString("")