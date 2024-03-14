package LV.`1`

fun main() {
    fun solution(food: IntArray): String {
        var answer: String = ""

        for (i in 1 until food.size) {
            val number = food[i] / 2

            if (number >= 1) {
                answer += i.toString().repeat(number)
            }
        }
        answer = answer + '0' + answer.reversed()

        return answer
    }

    println(solution(intArrayOf(1, 3, 4, 6)))
}