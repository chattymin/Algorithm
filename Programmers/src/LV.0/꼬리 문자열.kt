package LV.`0`

fun main() {
    println(solution(arrayOf("abc","def","ghi"), "ef"))
}

fun solution(str_list: Array<String>, ex: String): String = str_list.filter { !it.contains(ex) }.joinToString("")