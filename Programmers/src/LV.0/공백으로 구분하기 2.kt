package LV.`0`

fun main() {
    println(solution10("i  love   you").toList())
}

fun solution10(my_string: String): Array<String> = my_string.split(" ").filterNot { it.isBlank() }.toTypedArray()