package LV.`1`

fun main() {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var scoreList = intArrayOf()

        score.forEachIndexed{ index, score ->
            scoreList += score

            if(index >= k){
                scoreList = scoreList.sortedDescending().slice(0 until k).toIntArray()
            }

            answer += scoreList.minOf{it}
        }

        return answer
    }

    println(solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).toList())
}
