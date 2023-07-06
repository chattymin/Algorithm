package LV.`0`

fun main() {
    println(solution5(intArrayOf(4, 2, 6, 1, 7, 6), 2).toList())
}

fun solution5(num_list: IntArray, n: Int): IntArray = (0 until num_list.size step n).map { num_list[it] }.toIntArray()