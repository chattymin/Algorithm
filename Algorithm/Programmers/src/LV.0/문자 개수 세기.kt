package LV.`0`

fun main() {
    println(solution5("Programmers").toList())
}

fun solution5(my_string: String): IntArray {
    var answer: IntArray = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

    my_string.forEach {
        if (it.isLowerCase())
            answer[it - 'A' - 6]++
        else
            answer[it - 'A']++
    }


    return answer
}