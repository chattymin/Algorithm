package LV.`0`

fun main() {
    println(solution(intArrayOf(1,2,-3,4,-5)))
}

fun solution(numbers: IntArray): Int {
    numbers.sort()
    var result1 = numbers[0] * numbers[1]
    var result2 = numbers[numbers.size-1] * numbers[numbers.size-2]

    if (result1 > result2) return result1
    return result2
}