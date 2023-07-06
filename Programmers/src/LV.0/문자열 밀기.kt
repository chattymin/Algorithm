package LV.`0`

fun main() {
    println(solution2("hello", "ohell"))
}

fun solution2(A: String, B: String): Int {
    for(i in 0 until A.length){
        if (B.contains(A.slice(0 until A.length - i)) && B.startsWith(A.slice(A.length - i until A.length)))
            return i
    }
    return -1
}

// fun solution(A: String, B: String): Int = (B + B).indexOf(A)