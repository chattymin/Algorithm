fun main() {
    println(solution5("aAb1B2cC34oOp"))
}

fun solution5(my_string: String) = my_string.replace("[^\\d]".toRegex(), "").map {it - '0'}.sumOf { it }