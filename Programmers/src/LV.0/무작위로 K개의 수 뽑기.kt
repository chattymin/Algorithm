package LV.`0`

fun main() {
    println(solution7(intArrayOf(0,1,1,2,2,3), 3).toList())
}

fun solution7(arr: IntArray, k: Int): IntArray {
    var answer: IntArray = arr.distinct().toIntArray()

    if (answer.size < k){
        repeat(k - answer.size){
            answer = answer.plus(-1)
        }
    }

    return answer.sliceArray(0 until k)
}