fun main() {
    println(solution1(arrayOf("3 - 4 = -3", "5 + 6 = 11")).toList().toString())
}

fun solution1(quiz: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()

    for (i in quiz){
        val temp = i.split(" ")
        var fir = temp[0].toInt()
        var sec = temp[2].toInt()
        var end = temp[4].toInt()
        if (temp[1] == "+") if (fir + sec == end) answer = answer.plus("O") else answer = answer.plus("X")
        if (temp[1] == "-") if (fir - sec == end) answer = answer.plus("O") else answer = answer.plus("X")
    }

    return answer
}