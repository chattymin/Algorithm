package LV.`1`

fun main() {
    fun solution(a: IntArray, b: IntArray): Int = a.zip(b).map { it.first * it.second }.sum()

    var list1 = listOf(1,2,3,4,5)
    var list2 = listOf(3, 4, 5)

    var zipList = list1.zip(list2)

    println(zipList)







    println(solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2)))
}