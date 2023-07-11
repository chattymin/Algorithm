package LV.`0`

fun main() {
    println(solution8(intArrayOf(49, 12, 100, 276, 33), 27))
}

fun solution8(arr: IntArray, n: Int): IntArray {
    var result = arr
    if (arr.size % 2 == 0){
        for (i in 0 until result.size){
            if (i % 2 == 0)
                result[i] += n
        }
    } else{
        for (i in 0 until result.size){
            if (i % 2 == 1)
                result[i] += 2
        }
    }
    return result
}