package LV.`1`

fun main() {
    println(solution1(intArrayOf(1,2,3,4,6,7,8,0)))
}

fun solution1(numbers: IntArray): Int {
    var answer: Int = 0

    for (i in 0 .. 9){
        if (!numbers.contains(i)) answer += i
    }

    return answer
}

// fun solution1(numbers: IntArray): Int = (0..9).filterNot { numbers.contains(it) }.sum()