package LV.`0`

fun main() {
    println(solution1(intArrayOf(49, 13), intArrayOf(70,11,2)))
}

fun solution1(arr1: IntArray, arr2: IntArray): Int =
    if (arr1.size > arr2.size) 1
    else if (arr1.size < arr2.size) -1
    else arr1.sum().compareTo(arr2.sum())