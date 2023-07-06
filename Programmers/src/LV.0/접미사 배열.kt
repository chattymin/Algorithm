package LV.`0`

fun main() {
    println(solution4("banana").toList())
}

fun solution4(my_string: String): Array<String> = (1 ..  my_string.length).map { my_string.substring(my_string.length - it) }.toTypedArray().sortedArray()