package LV.`0`

fun main() {
    println(solution16("123456789"))
}

fun solution16(num_str: String): Int = num_str.sumOf { it.digitToInt() }