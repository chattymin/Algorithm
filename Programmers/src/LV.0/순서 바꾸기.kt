package LV.`0`

fun main() {
    println(solution3(intArrayOf(2,1,6), 1).toList())
}

fun solution3(num_list: IntArray, n: Int): IntArray = num_list.sliceArray(n .. num_list.lastIndex) + num_list.sliceArray(0 until  n)