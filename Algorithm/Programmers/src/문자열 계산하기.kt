fun main() {
    println(solution3("2 + 7 - 5 + 10"))
}

fun solution3(my_string: String): Int {
    val result = my_string.split(" ")
    var answer = my_string[0] - '0'

    for (i in 1 until result.size step(2)){
        if (result[i] == "+") answer += result[i + 1].toInt()
        else if (result[i] == "-") answer -= result[i + 1].toInt()
    }

    return answer
}