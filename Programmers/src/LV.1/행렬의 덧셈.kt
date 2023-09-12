package LV.`1`

fun main() {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var result = arrayOf<IntArray>()
        for (i in 0 until arr1.size){
            var arrTemp = intArrayOf()
            for (j in 0 until arr1[i].size){
                arrTemp += arr1[i][j] + arr2[i][j]
            }
            result += arrTemp
        }
        return result
    }

    println(solution(arrayOf(intArrayOf(1,2), intArrayOf(2, 3)), arrayOf(intArrayOf(3,4), intArrayOf(5,6))))
}