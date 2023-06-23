package LV.`0`

fun main() {
    println(solution6(intArrayOf(3,4,5,2,1)).toList())
}

fun solution6(num_list: IntArray): IntArray = num_list.plus(if (num_list.last() > num_list[num_list.size - 2]) num_list.last() - num_list[num_list.size - 2] else num_list.last() * 2)