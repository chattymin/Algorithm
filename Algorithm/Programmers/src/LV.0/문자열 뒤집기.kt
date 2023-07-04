package LV.`0`

fun main() {
    println(solution("Progra21Sremm3", 6, 12))
}

fun solution(my_string: String, s: Int, e: Int): String = my_string.replace(my_string.slice(s .. e), my_string.slice(s .. e).reversed())