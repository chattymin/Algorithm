package LV.`1`

import kotlin.math.sqrt

fun main() {
    println(solution1(121L))
}

fun solution1(n: Long): Long {
    var temp = sqrt(n.toDouble()).toLong()

    return if (temp * temp == n) (temp+1) * (temp+1) else -1
}