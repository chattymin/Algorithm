fun main() {
    println(solution("20220552"))
}

fun solution(rsp: String): String = rsp.map {
    when(it){
        '2' -> '0'
        '0' -> '5'
        else -> '2'
    }}.joinToString("")