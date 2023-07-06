import kotlin.test.assertNotSame

fun main() {
    val input: IntArray = intArrayOf(3,76,24)
    println(solution(input))
}

fun solution(emergency: IntArray) = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()