package LV.`1`

fun main() {
    println(solution(arrayOf("Jane", "Kim")))
}

fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOfFirst { it == "Kim" }}에 있다"