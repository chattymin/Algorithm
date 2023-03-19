fun main() {
    println(solution(3, intArrayOf(4,5,6,7,8,9,10,11,12)))
}

fun solution(n: Int, numlist: IntArray) = numlist.filter { it % n == 0 }