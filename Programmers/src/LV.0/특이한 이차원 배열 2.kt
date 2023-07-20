package LV.`0`

fun main() {
    println(solution8(4))
}

fun solution4(arr: Array<IntArray>): Int {
    for (i in 0 until arr.size){
        for (j in 0 until arr.size){
            if (arr[i][j] != arr[j][i])
                return 0
        }
    }
    return 1
}