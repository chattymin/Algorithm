package LV.`0`

fun main() {
    println(solution("rermgorpsam", arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))))
}

fun solution(my_string: String, queries: Array<IntArray>): String {
    var answer: String = my_string

    queries.forEach {
        val str = answer.slice(it.first() .. it.last())
        answer = answer.slice(0 until it.first()) + str.reversed() + answer.slice(it.last() + 1 until my_string.length)
    }

    return answer
}