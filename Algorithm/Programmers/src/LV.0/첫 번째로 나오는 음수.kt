package LV.`0`

fun main() {
    println(solution9(intArrayOf(12, 4, 15, 46, 38, -2, 15)))
}

//fun solution9(num_list: IntArray): Int = num_list.indexOf(num_list.filter { it < 0 }.firstOrNull()?:-1)
fun solution9(num_list: IntArray): Int = num_list.indexOfFirst { it < 0 }