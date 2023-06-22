package LV.`0`

import kotlin.math.max

fun main() {
    println(solution3(9, 91))
}

fun solution3(a: Int, b: Int): Int = max((a.toString() + b.toString()).toInt(), (b.toString() + a.toString()).toInt())