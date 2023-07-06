package LV.`0`

fun main() {
    println(solution4(intArrayOf(3,4,5,2,1)))
}

fun solution4(num_list: IntArray): Int {
    var answer: Int = 1
    var hap = num_list.sum()
    for (i in num_list)
        answer *= i

    return if (answer > hap * hap) 0 else 1
}
