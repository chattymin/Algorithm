package LV.`0`

fun main() {
    println(solution(1, 13, 1))
}

fun solution(i: Int, j: Int, k: Int): Int {
    var answer: Int = 0
    for (it in i .. j){
        if (it.toString().contains(k.toString())) answer += it.toString().count{it.toString() == k.toString()}
    }
    return answer
}

// fun solution(i: Int, j: Int, k: Int): Int = (i..j).joinToString("").count { it.digitToInt() == k }