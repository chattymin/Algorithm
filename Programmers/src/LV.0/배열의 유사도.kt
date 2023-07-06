package LV.`0`

fun main() {
    println(solution1(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
}

fun solution1(s1: Array<String>, s2: Array<String>) = s1.filter { s2.contains(it) }.count()