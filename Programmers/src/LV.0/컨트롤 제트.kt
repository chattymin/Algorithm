fun main() {
    println(solution6("1 2 Z 3"))
}

fun solution6(s: String): Int {
    var answer: Int = 0
    var str = s.split(" ")

    for (i in 0 until str.size){
        if (str[i].equals("Z")) answer -= str[i-1].toInt()
        else answer += str[i].toInt()
    }

    return answer
}