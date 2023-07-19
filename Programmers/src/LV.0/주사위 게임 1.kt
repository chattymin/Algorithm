package LV.`0`

import kotlin.math.abs

fun main() {
    println(solution10(3,5))
}

fun solution10(a: Int, b: Int): Int =
    if (checkEven(a) && checkEven(b)) abs(a - b) // 둘다 짝수
    else if (checkEven(a) || checkEven(b)) 2 * (a + b) // 둘중 하나 짝수
    else a * a + b * b // 둘다 홀수

fun checkEven(num: Int): Boolean = (num % 2 == 0)