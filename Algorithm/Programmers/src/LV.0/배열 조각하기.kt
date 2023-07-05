package LV.`0`

fun main() {
    println(solution(intArrayOf(0,1,2,3,4,5), intArrayOf(4,1,2)).toList())
}

fun solution(arr: IntArray, query: IntArray): IntArray {
    var answer: List<Int> = arr.toList()

    for (i in 0 until query.size){
        if (i % 2 == 0)
            answer = answer.slice(0 .. query[i])
        else
            answer = answer.slice(query[i] until  answer.size)
    }

    return answer.toIntArray()
}// 짝수는 뒤를자르고, 홀수는 앞을 자르고