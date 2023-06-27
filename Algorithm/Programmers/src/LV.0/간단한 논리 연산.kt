package LV.`0`

fun main() {
    println(solution(false, true, true, true))
}

fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean = (x1 || x2) && (x3 || x4)