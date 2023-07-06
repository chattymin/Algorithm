package LV.`0`

fun main() {
    println(solution7(intArrayOf(0,1,0,10,0,1,0,10,0,-1,-1,-2)))
}

fun solution7(numLog: IntArray): String {
    var answer: String = ""

    for (i in 1 until numLog.size){
        when(numLog[i] - numLog[i-1]){
            1 -> answer += "w"
            -1 -> answer += "s"
            10 -> answer += "d"
            -10 -> answer += "a"
        }
    }

    return answer
}