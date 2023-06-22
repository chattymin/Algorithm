package LV.`0`

fun main() {
    println(solution1(60, 2, 3))
}

fun solution1(number: Int, n: Int, m: Int): Int = if (number % n == 0 && number % m == 0) 1 else 0