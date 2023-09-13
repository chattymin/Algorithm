package LV.`1`

fun main() {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var pLen = p.length

        for (i in 0 .. t.length - pLen){
            if (t.substring(i until i + pLen) <= p)
                answer++
        }

        return answer
    }

    println(solution("10203", "15"))
}