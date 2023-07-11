package LV.`0`

fun main() {
    println(solution17(intArrayOf(0,1,1,1,0)).toList())
}

fun solution17(arr: IntArray): IntArray {
    var stk: IntArray = intArrayOf()
    var i = 0

    while (i < arr.size){
        if (stk.isEmpty()) stk = stk.plus(arr[i])
        else if (stk.last() == arr[i]) stk = stk.sliceArray(0 until stk.lastIndex)
        else if (stk.last() != arr[i]) stk = stk.plus(arr[i])
        i++
    }
    if (stk.isEmpty()) stk = stk.plus(-1)

    return stk
}