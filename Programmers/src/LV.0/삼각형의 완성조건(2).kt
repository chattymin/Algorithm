package LV.`0`

fun main() {
    println(solution2(intArrayOf(11,7)))
}

fun solution2(sides: IntArray): Int = ((sides.maxOrNull()!! - sides.minOrNull()!!)..(sides.maxOrNull()!! + sides.minOrNull()!!) - 2).count()