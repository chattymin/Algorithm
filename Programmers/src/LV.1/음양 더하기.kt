package LV.`1`

fun main() {
    println(solution(intArrayOf(4,7,12), booleanArrayOf(true, false, true)))
}

fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 0
    for (i in 0 until signs.size){
        if (signs[i])
            answer += absolutes[i]
        else
            answer -= absolutes[i]
    }
    return answer
}