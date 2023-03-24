package LV.`0`

fun main() {
    println(solution1(intArrayOf(1,2,3)))
}


fun solution1(sides: IntArray) = if (sides.maxOrNull()!! >= sides.sum() - sides.maxOrNull()!!) 2 else 1