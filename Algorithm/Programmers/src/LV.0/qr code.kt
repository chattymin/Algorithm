package LV.`0`

fun main() {
    println(solution( 3, 1, "qjnwezgrpirldywt"))
}

fun solution(q: Int, r: Int, code: String): String = (r until code.length step q).map { code[it] }.joinToString("")