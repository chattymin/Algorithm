import java.util.*

fun main() {
    println(solution2(intArrayOf(1,2,3,4,5,6,7,8,9), 3))
}

fun solution(num_list: IntArray, n: Int): Array<Array<Int>> {
    var answer: Array<Array<Int>> = arrayOf<Array<Int>>()

    for (i in 0 until num_list.size step(n)){
        var temp: Array<Int> = arrayOf()

        repeat(n){
            temp = temp.plus(num_list.get(i + it))
        }

        answer = answer.plus(temp)
    }
    answer.forEach {
        println(Arrays.toString(it))
    }

    return answer
}

fun solution2(num_list: IntArray, n: Int) = num_list.toList().chunked(n)