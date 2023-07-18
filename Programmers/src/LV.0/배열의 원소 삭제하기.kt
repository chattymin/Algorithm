package LV.`0`

fun main() {
    println(solution2(intArrayOf(293, 1000, 395, 678, 94), intArrayOf(94, 777, 104, 1000, 1, 12)))
}

fun solution2(arr: IntArray, delete_list: IntArray): IntArray = arr.filter { !delete_list.contains(it) }.toIntArray()