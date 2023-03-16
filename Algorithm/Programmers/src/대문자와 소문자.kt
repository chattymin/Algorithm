fun main() {
    println(solution9("cccCCC"))
}

fun solution9(my_string: String) = my_string.map {
    if (it.isLowerCase()) it.uppercaseChar()
    else it.lowercaseChar()
}.joinToString("")