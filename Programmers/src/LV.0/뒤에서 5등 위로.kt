package LV.`0`

fun main() {
    println(solution20(intArrayOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)).toList())
}

fun solution20(num_list: IntArray): IntArray = num_list.sorted().slice(5 until num_list.size).toIntArray()