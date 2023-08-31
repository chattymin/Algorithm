package LV.`1`

fun main() {
    println(solution2(intArrayOf(4,3,2,1)).toList())
}

fun solution2(arr: IntArray): IntArray = if(arr.size == 1) arrayOf(-1).toIntArray()
else arr.filter { it != arr.minOf {min-> min } }.toIntArray()