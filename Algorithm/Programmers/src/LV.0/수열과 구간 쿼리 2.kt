package LV.`0`

import kotlin.math.min

fun main() {
    println(solution1(intArrayOf(0,1,2,4,3), arrayOf(intArrayOf(0,4,2), intArrayOf(0,3,2), intArrayOf(0,2,2))).toList())
}

fun solution1(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf()

    queries.forEach { (fir, sec, num) ->
        var result = arr.slice(fir .. sec).filter { it > num }.sorted()
        answer += if (result.isEmpty()) -1 else result.first()

    }

    return answer
}