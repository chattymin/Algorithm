fun main() {
    println(solution1(intArrayOf(1,2,3,4,5)).toList().toString())
}

fun solution1(num_list: IntArray) = intArrayOf(num_list.filter { it % 2 == 0 }.count(), num_list.filter { it % 2 == 1 }.count())