package LV.`0`

fun main() {
    println(solution3("123"))
}

fun solution3(number: String): Int = number.fold(0) { total, num -> total + num.digitToInt() } % 9