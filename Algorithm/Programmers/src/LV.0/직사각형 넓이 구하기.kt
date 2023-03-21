package LV.`0`

import kotlin.math.absoluteValue

fun main() {
    println(solution(arrayOf(intArrayOf(-1,-1),intArrayOf(1,1),intArrayOf(1,-1),intArrayOf(-1,1))))
}

fun solution(dots: Array<IntArray>): Int {
    var x = intArrayOf()
    var y = intArrayOf()

    for (i in dots){
        x = x.plus(i[0])
        y = y.plus(i[1])
    }

    x.sort()
    y.sort()

    val xLen = x[3] - x[0]
    val yLen = y[3] - y[0]

    return (xLen * yLen).absoluteValue
}