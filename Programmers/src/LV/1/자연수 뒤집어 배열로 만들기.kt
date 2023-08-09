package LV.`1`

fun main() {
    println(solution(12345L))
}

fun solution(n: Long): IntArray = n.toString().reversed().map { it.digitToInt() }.toIntArray()