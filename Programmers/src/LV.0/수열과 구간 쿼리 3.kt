package LV.`0`

fun main() {
    println(solution(intArrayOf(0,1,2,3,4), arrayOf(intArrayOf(0,3), intArrayOf(1,2), intArrayOf(1,4))).toList())
}

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = arr

    queries.forEach {
        var temp = answer[it.first()]
        answer[it.first()] = answer[it.last()]
        answer[it.last()] = temp
    }

    return answer
}