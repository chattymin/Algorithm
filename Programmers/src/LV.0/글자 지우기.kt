package LV.`0`

fun main() {
    println(solution1("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11, 3)))
}

/*
fun solution1(my_string: String, indices: IntArray): String {
    var answer: String = my_string

    indices.sorted().reversed().forEach {
        answer = answer.slice(0 until it) + answer.slice(it + 1 until answer.length)
    }

    println(answer)

    return answer.filter { it != '1' }
}

 */

fun solution1(my_string: String, indices: IntArray): String = my_string.filterIndexed{index, c -> index !in indices}