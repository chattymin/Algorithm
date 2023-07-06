package LV.`0`

fun main() {
    println(solution4(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0,1), intArrayOf(1,2), intArrayOf(2,3))))
}

fun solution4(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = arr

    queries.forEach { (start, end) ->
        (start .. end).map { answer[it]++ }
    }

    return answer
}