package LV.`0`

import kotlin.math.max

fun main() {
    println(solution11(intArrayOf(4,2,6,1,7,6)))
}

fun solution11(num_list: IntArray): Int = max((0 .. num_list.lastIndex step 2).sumOf { num_list[it] }, (1 .. num_list.lastIndex step 2).sumOf { num_list[it] })