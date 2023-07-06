package LV.`0`

fun main() {
    println(solution3("aaaaa", "bbbbbb"))
}

fun solution3(str1: String, str2: String): String {
    var answer: String = ""

    for (i in 0 until str1.length){
        answer += str1[i]
        answer += str2[i]
    }

    return answer
}

// fun solution(str1: String, str2: String) = str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }