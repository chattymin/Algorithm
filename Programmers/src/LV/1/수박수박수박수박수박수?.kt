package LV.`1`

fun main() {
    fun solution(n: Int): String = "수박".repeat(n/2) + if (n % 2 == 0) "" else "수"

    println(solution(3))
}