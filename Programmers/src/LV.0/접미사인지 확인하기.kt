package LV.`0`

fun main() {
    println(solution4("banana", "ana"))
}

fun solution4(my_string: String, is_suffix: String): Int = if (my_string.endsWith(is_suffix)) 1 else 2