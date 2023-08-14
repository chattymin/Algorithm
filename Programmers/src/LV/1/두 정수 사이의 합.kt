package LV.`1`

import kotlin.math.max
import kotlin.math.min

fun main() {
    println(solution1(3, 5))
}

fun solution1(a: Int, b: Int): Long = (min(a,b)..max(a,b)).sumOf { it.toLong() }
