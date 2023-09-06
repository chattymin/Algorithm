package LV.`1`

fun main() {
    fun solution(s: String): String {
        var temp = s.split(" ")
        var answer = ""

        for (it in 0 until temp.size){
            for (i in 0 until temp[it].length){
                answer += if (i % 2 == 0) temp[it][i].uppercase() else temp[it][i].lowercase()
            }
            if (it != temp.size - 1) answer += " "
        }

        return answer
    }

    println(solution("try hello world"))
}