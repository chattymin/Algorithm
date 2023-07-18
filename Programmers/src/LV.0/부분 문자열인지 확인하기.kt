package LV.`0`

fun main() {
    println(solution12("banana", "ana"))
}

fun solution12(my_string: String, target: String): Int = if (my_string.contains(target)) 1 else 0