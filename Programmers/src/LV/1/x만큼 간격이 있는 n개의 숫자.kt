package LV.`1`

fun main() {
    println(solution(2, 5))
}

/*
fun solution(x: Int, n: Int): LongArray {
    var answer = longArrayOf()
    var temp:Long = 0
    repeat(n){
        temp += x
        answer = answer.plus(temp)
    }

    return answer
}

 */

fun solution(x: Int, n: Int): LongArray = LongArray(n){x.toLong() * (it+1)}