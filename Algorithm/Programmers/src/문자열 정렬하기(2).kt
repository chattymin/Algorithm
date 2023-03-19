fun main() {
    println(solution0("Bcad"))
}

fun solution0(my_string: String) = my_string.map { if (it.isUpperCase()) it.lowercaseChar() else it}.sorted().joinToString("")