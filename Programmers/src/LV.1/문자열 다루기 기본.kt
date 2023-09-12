package LV.`1`

fun main() {
    //fun solution(s: String): Boolean = (s.length == 4 || s.length == 6) && s.all { it.isDigit() }
    fun solution(s: String): Boolean = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

    println(solution("a234"))
}