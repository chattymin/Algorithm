package LV.`0`

fun main() {
    println(solution10(intArrayOf(1,2,1,4,5,2,9)))
}

fun solution10(arr: IntArray): IntArray {
    var first = arr.indexOfFirst { it == 2 }
    var end = arr.indexOfLast { it == 2 }

    return if (first == -1) intArrayOf(-1) else arr.slice(first .. end).toIntArray()
}