package LV.`0`

fun main() {
    println(solution5(arrayOf(intArrayOf(572,22,37), intArrayOf(287,726,384), intArrayOf(85,137,292), intArrayOf(487,13,876))))
}

fun solution5(arr: Array<IntArray>): Array<IntArray> {
    var answer: Array<IntArray> = arr
    for (i in 0 until answer.size){
        if (answer.size > answer[i].size){
            repeat(answer.size-answer[i].size) {
                answer[i] = answer[i].plus(0)
            }
        }else if (answer.size < answer[i].size){
            repeat(answer[i].size-answer.size){
                answer = answer.plus(IntArray(answer[i].size,{0}))
            }
            break
        }else break
    }
    return answer
}