package LV.`1`

fun main() {
    println(solution2(12345))
}

fun solution2(n: Int): Int = n.toString().sumOf { it.digitToInt() }
