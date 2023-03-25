import java.util.LinkedList
import java.util.Queue

fun main() {
    println(solution(intArrayOf(2,3,7,2), intArrayOf(4,6,5,1)))
}

fun solution(queue1: IntArray, queue2: IntArray): Int {
    var answer: Int = 0
    val size = queue1.size
    var max = size * 3

    val q1: Queue<Int> = LinkedList()
    var q1Sum: Long = 0
    val q2: Queue<Int> = LinkedList()
    var q2Sum: Long = 0

    // 큐 생성
    repeat(size){
        q1Sum += queue1[it].toLong()
        q1.offer(queue1[it])
    }
    repeat(size){
        q2Sum += queue2[it].toLong()
        q2.offer(queue2[it])
    }

    // 계산
    repeat(max){
        if (q1Sum == q2Sum) return answer // 성공조건
        if (q1Sum > q2Sum){
            var num = q1.poll()
            q1Sum -= num
            q2Sum += num
            q2.offer(num)
            answer++
        }
        else if (q1Sum < q2Sum){
            var num = q2.poll()
            q1Sum += num
            q2Sum -= num
            q1.offer(num)
            answer++
        }
    }

    return -1
}