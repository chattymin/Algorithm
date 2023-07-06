fun main() {
    println(solution2(intArrayOf(7,77,17)))
}

//fun solution2(array: IntArray) = array.map { it.toString().filter { num-> num == '7' }.count() }.sum()
fun solution2(array: IntArray) = array.joinToString ( "" ).count { it == '7' }