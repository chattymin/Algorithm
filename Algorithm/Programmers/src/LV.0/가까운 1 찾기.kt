package LV.`0`

fun main() {
    println(solution1(intArrayOf(1, 0, 0, 1, 0, 0), 4))
}

fun solution1(arr: IntArray, idx: Int): Int {
    val result = arr.slice(idx until arr.size).indexOf(1)

    return if (result != -1) result + idx else result
}