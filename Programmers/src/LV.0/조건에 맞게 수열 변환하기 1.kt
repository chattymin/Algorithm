package LV.`0`

fun main() {
    println(solution12(intArrayOf(1,2,3,100,99,98)))
}

fun solution12(arr: IntArray): IntArray = arr.map {
    if (it < 50 && it % 2 == 1)
        it * 2
    else if (it >= 50 && it % 2 == 0)
        it / 2
    else
        it
}.toIntArray()