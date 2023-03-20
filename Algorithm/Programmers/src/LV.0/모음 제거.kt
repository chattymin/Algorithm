fun main() {
    println(solution7("bus"))
}

fun solution7(my_string: String) = my_string.replace("a|e|i|o|u".toRegex(), "")