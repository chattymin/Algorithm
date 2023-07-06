package LV.`0`

fun main() {
    println(solution1("aAb1B2cC34oOp"))
}

fun solution1(my_string: String) = my_string.replace("[^0-9]".toRegex(), " ").split(" ").filter { it != "" }.sumOf { it.toInt() }