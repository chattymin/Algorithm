package LV.`1`

import kotlin.math.max

fun main() {
    fun solution(price: Int, money: Int, count: Int): Long = max((1 .. count).sum() * price.toLong() - money,0)
    /*
    fun solution(price: Int, money: Int, count: Int): Long{
        val bill = (1 .. count).sum() * price.toLong()

        return if (money < bill) bill - money else 0
    }

     */

    println(solution(3,20,4))
}