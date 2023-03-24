package LV.`0`

fun main() {
    println(solution(arrayOf("We", "are", "the", "world!")))
}

fun solution(strlist: Array<String>) = strlist.map { it.length }