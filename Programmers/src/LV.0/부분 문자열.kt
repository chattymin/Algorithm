package LV.`0`

fun main() {
    println(solution13("abc", "aabcc"))
}
fun solution13(str1: String, str2: String): Int = if (str2.contains(str1)) 1 else 0