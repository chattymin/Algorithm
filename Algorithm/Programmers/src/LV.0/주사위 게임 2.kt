package LV.`0`

fun main() {
    println(solution2(2,6, 1))
}

fun solution2(a: Int, b: Int, c: Int): Int =
    if (a == b && a == c){ // 다 같은 경우
        a + b + c
    }else if (a == b || b == c || a == c){
        (a + b + c) * (a * a + b * b + c * c)
    }else {
        (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
    }