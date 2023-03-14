fun main() {
    println(solution8("hi12392"))
}

fun solution8(my_string: String) = my_string.replace("[^\\d]".toRegex(), "").toList().sorted().map { it - '0' }