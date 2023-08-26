package LV.`1`

fun main() {
    println(solution(intArrayOf(5,9,7,10), 5))
}
fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = arr.filter { it % divisor == 0 }.sorted().toIntArray()
    if (answer.isEmpty()) answer += -1
    return answer
}