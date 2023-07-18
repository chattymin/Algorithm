package LV.`0`

fun main() {
    println(solution11("0010", "1324"))
}

fun solution11(a: String, b: String): String = "${a.toBigInteger() + b.toBigInteger()}"