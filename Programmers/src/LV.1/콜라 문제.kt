package LV.`1`

fun main() {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var cola = n

        while(cola >= a) {
            answer += (cola / a) * b
            cola = (cola / a) * b + cola % a
        }

        return answer
    }

    println(solution(2,1,20))
}
