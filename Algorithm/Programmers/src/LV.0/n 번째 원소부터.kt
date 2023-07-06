package LV.`0`

fun main() {
    println(solution2(intArrayOf(2,1,6), 3).toList())
}

fun solution2(num_list: IntArray, n: Int): IntArray = num_list.sliceArray(n-1 .. num_list.lastIndex)