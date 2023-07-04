package LV.`0`

fun main() {
    println(solution(arrayOf("0123456789","9876543210","9999999999999"), 50000, 5, 5).toList())
}

fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
    var answer: IntArray = intArrayOf()

    intStrs.forEach {
        var temp = it.slice(s until s + l).toInt()
        println(temp)

        if (k < temp)
            answer = answer.plus(temp)
    }

    return answer
}