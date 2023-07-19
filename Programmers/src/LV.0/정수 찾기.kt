package LV.`0`

fun main() {
    println(solution9(intArrayOf(1,2,3,4,5), 3))
}

fun solution9(num_list: IntArray, n: Int): Int = if (num_list.contains(n)) 1 else 0