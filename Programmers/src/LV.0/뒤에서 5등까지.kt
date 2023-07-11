package LV.`0`

fun main() {
    println(solution19(intArrayOf(12,4,15,36,38,1,14)).toList())
}

fun solution19(num_list: IntArray): IntArray = num_list.sorted().slice(0 until 5).toIntArray()