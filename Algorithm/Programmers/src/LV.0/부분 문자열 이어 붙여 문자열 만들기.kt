package LV.`0`

fun main() {
    println(solution(arrayOf("progressive", "hamburger", "hammer", "ahocorasick"), arrayOf(intArrayOf(0,4), intArrayOf(1,2), intArrayOf(3,5), intArrayOf(7,7))))
}

fun solution(my_strings: Array<String>, parts: Array<IntArray>): String{
    var answer = ""

    for (i in 0 until my_strings.size){
        answer += my_strings[i].slice(parts[i].first() .. parts[i].last())
    }

    return answer
}