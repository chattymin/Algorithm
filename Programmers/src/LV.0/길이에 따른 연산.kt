package LV.`0`

fun main() {
    println(solution15(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)))
}

fun solution15(num_list: IntArray): Int =
    if (num_list.size <= 10)
        num_list.fold(1){ sum, num -> sum*num }
    else
        num_list.sum()