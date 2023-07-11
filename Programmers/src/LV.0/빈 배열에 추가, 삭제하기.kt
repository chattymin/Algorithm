package LV.`0`

import java.util.Stack

fun main() {
    println(solution(intArrayOf(3,2,4,1,33), booleanArrayOf(true, false, true, false, false)).toList())
}

fun solution(arr: IntArray, flag: BooleanArray): IntArray {
    var result = Stack<Int>()
    for (i in 0 until arr.size){
        if (flag[i]){
            repeat(arr[i] * 2){
                result.push(arr[i])
            }
        }else{
            repeat(arr[i]){
                result.pop()
            }
        }
    }

    return result.toIntArray()
}