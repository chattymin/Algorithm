package LV.`1`

fun main() {
    fun isSmall(ch: Char) = ch in 'a'..'z'

    fun isBig(ch: Char) = ch in 'A'..'Z'

    /*
    fun solution(s: String, n: Int): String {
        var answer = ""

        s.forEach {
            var temp = ' '

            if (isSmall(it)){
                temp = it + n
                if (temp > 'z')
                    temp -= 26
            }else if (isBig(it)){
                temp = it + n
                if (temp > 'Z')
                    temp -= 26
            }

            answer += temp
        }

        return answer
    }

     */

    fun solution(s: String, n: Int): String = s.map {
        when{
            it.isLowerCase() -> 'a' + (it - 'a' + n) % 26
            it.isUpperCase()-> 'A' + (it - 'A' + n) % 26
            else -> ' '
        }
    }.joinToString("")




    println(solution("AB", 1))
}