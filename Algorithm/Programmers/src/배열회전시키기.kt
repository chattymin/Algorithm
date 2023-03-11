import java.util.*

fun main() {
    println(Arrays.toString(solution(intArrayOf(1,2,3), "left")))
}

fun solution(numbers: IntArray, direction: String): IntArray {
    var answer: IntArray = intArrayOf()

    if (direction == "right"){
        answer = answer.plus(numbers.last())
        answer = answer.plus(numbers.slice(0 until numbers.size-1))
    }else{
        answer = answer.plus(numbers.slice(1 .. numbers.size-1))
        answer = answer.plus(numbers.first())
    }

    return answer
}