package LV.`1`

fun main() {
    fun solution(s: String): String = s.slice(s.length - s.length/2 - 1 .. s.length/2)

    println(solution("abcde"))
}