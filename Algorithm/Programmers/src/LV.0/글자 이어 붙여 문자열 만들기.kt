package LV.`0`

fun main() {
    println(solution("cvsgiorszzzmrpaqpe", intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)))
}

fun solution(my_string: String, index_list: IntArray): String = index_list.map { my_string[it] }.joinToString ( "" )