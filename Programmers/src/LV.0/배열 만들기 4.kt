package LV.`0`

import java.util.Stack

fun main() {
    println(solution8(intArrayOf(1,4,2,5,3)).toList())
}

fun solution8(arr: IntArray): IntArray {
    var stk : Stack<Int> = Stack()
    var i = 0

    while (i < arr.size) {
        if (stk.isEmpty()){
            stk.push(arr[i])
            i++
        }else{
            if (stk.last() < arr[i]){
                stk.push(arr[i])
                i++
            }else{
                stk.pop()
            }
        }
    }

    return stk.toIntArray()
}