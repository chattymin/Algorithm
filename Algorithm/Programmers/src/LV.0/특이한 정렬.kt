package LV.`0`

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main() {
    println(solution(intArrayOf(6,4,5,7,3), 5).toList().toString())
}

//fun solution(numlist: IntArray, n: Int) = numlist.sortedDescending().sortedBy { max(it, n) - min(it, n) }
// 내가 푼 풀이는 아님. 하지만 원리는 같음. map을 사용하는게 아니라, 코틀린 내장함수를 활용해서 기준을 제시해주자.

fun solution(numlist: IntArray, n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    var temp: MutableMap<Int, Int> = mutableMapOf()

    for (i in 0 until numlist.size) {
        temp.set(numlist[i], abs(numlist[i] - n))
    }

    temp = temp.toList().sortedBy { it.second }.toMap().toMutableMap()


    for (i in 0 until temp.size - 1) {
        if (temp.toList().get(i).second == temp.toList().get(i + 1).second) {
            if (temp.toList().get(i + 1).first > temp.toList().get(i).first) {
                answer = answer.plus(temp.toList().get(i + 1).first)
                answer = answer.plus(temp.toList().get(i).first)
            }else{
                answer = answer.plus(temp.toList().get(i).first)
            }
        } else if (!answer.contains(temp.toList().get(i).first)) {
            answer = answer.plus(temp.toList().get(i).first)
        }
    }

    answer = answer.plus(temp.toList().last().first)
    return answer
}