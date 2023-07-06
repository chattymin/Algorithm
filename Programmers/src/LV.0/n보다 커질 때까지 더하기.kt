package LV.`0`

fun main() {
    println(solution6(intArrayOf(34, 5, 71, 29, 100, 34), 123))
}

fun solution6(numbers: IntArray, n: Int): Int {
    var answer = 0

    numbers.forEach {
        answer += it
        if (answer >= n) return answer
    }

    return answer
}