package LV.`0`

fun main() {
    println(solution5(1081))
}

fun solution5(chicken: Int): Int {
    var chic = chicken
    var answer: Int = 0
    while (chic >= 10){
        answer += chic / 10
        chic = chic / 10 + chic % 10
    }
    return answer
}