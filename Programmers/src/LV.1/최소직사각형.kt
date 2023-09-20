package LV.`1`

import java.lang.Integer.max

fun main() {
    fun solution(sizes: Array<IntArray>): Int {
        var maxNum = Int.MIN_VALUE
        var minNum = Int.MIN_VALUE

        sizes.forEach {
            var maxLocal: Int
            var minLocal: Int

            if (it.first() > it.last()){
                maxLocal = it.first()
                minLocal = it.last()
            }else {
                maxLocal = it.last()
                minLocal = it.first()
            }

            maxNum = max(maxNum, maxLocal)
            minNum = max(minNum, minLocal)
        }

        return maxNum * minNum
    }

    println(solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))))
}
