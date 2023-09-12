package LV.`1`

fun main() {
    fun solution(s: String): String = s.toCharArray().sortedArrayDescending().joinToString("")

    println(solution("ZbKcdkggeDACfg"))
}