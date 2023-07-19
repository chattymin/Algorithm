package LV.`0`

fun main() {
    println(solution10(intArrayOf(1,2,3,100,99,98), 3).toList())
}

fun solution10(arr: IntArray, k: Int): IntArray =
    if (k % 2 == 0) arr.map { it + k }.toIntArray()
    else arr.map { it * k }.toIntArray()