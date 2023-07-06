package LV.`0`

fun main() {
    println(solution4(intArrayOf(2,1,6), 1).toList())
}

fun solution4(num_list: IntArray, n: Int): IntArray = num_list.sliceArray(0 until n)