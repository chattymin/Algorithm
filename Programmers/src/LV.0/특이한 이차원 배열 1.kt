package LV.`0`

fun main() {
    println(solution2(3))
}

fun solution2(n: Int): Array<IntArray> {
    var answer: Array<IntArray> = arrayOf<IntArray>()

    for (i in 0 until n){
        var temp = intArrayOf()
        for (j in 0 until n){
            if (j == i) temp += 1
            else temp += 0
        }
        answer = answer.plus(temp)
    }
    return answer
}