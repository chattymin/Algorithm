package LV.`0`

fun main() {
    println(solution("He110Wor1d", "lloWorl", 2))
}

fun solution(my_string: String, overwrite_string: String, s: Int): String = my_string.slice(0 until s) + overwrite_string + my_string.slice(overwrite_string.length + s until my_string.length)
//fun solution(my_string: String, overwrite_string: String, s: Int): String = my_string.replace(my_string.slice(s until s + overwrite_string.length), overwrite_string)