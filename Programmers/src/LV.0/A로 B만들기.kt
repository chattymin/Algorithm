package LV.`0`

fun main() {
    println(solution1("allpe", "apple"))
}

fun solution1(before: String, after: String): Int = if (before.toList().sorted() == after.toList().sorted()) 1 else 0
