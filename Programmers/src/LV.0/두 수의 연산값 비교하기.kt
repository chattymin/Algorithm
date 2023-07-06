package LV.`0`

import kotlin.math.max

fun main() {
    println(solution4(9, 91))
}

fun solution4(a: Int, b: Int): Int  = max(("$a$b".toInt()), (2*a*b))