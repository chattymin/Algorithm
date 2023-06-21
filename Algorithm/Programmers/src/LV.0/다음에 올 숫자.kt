package LV.`0`

fun main() {
    println(solution3(intArrayOf(2,4,8)))
}

fun solution3(common: IntArray): Int =
    if (common[1] - common[0] == common[2] - common[1]) common.last() + common[1] - common[0]
    else common.last() * (common[1] / common[0])