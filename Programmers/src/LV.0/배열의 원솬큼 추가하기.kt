package LV.`0`

fun main() {
    println(solution16(intArrayOf(5,1,4)).toList())
}

fun solution16(arr: IntArray): IntArray {
    var result = intArrayOf()

    arr.map { num ->
        repeat(num){
            result = result.plus(num)
        }
    }
    return result
}