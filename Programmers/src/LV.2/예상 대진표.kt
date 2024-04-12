package LV.`2`

fun main() {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var first = a
        var second = b

        while (first != second) {
            first = (first + 1) / 2
            second = (second + 1) / 2
            answer++
        }

        return answer
    }

    println(solution(8, 4, 6))
}
