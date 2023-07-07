package LV.`0`

fun main() {
    println(solution7("programmers", "p"))
}

fun solution7(my_string: String, alp: String): String = my_string.lowercase().replace(alp, alp.uppercase())