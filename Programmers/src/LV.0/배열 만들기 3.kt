package LV.`0`

fun main() {
    println(solution3(intArrayOf(1,2,3,4,5), arrayOf(intArrayOf(1,3), intArrayOf(0,4))).toList())
}

/*
fun solution3(arr: IntArray, intervals: Array<IntArray>): IntArray {
    var result: IntArray = intArrayOf()

    intervals.forEach {
        result = result.plus(arr.slice(it.first() .. it.last()))
    }

    return result
}
 */
fun solution3(arr: IntArray, intervals: Array<IntArray>): IntArray = intervals.flatMap { (start, end) ->
    arr.slice(start .. end)
}.toIntArray()

