package LV.`0`

fun main() {
    println(solution14(intArrayOf(12, 4, 15, 1, 14)))
}

fun solution14(num_list: IntArray): Int {
    var answer: Int = 0

    num_list.forEach {
        var num = it

        while (true){
            if (num == 1) break
            num = num / 2
            answer++
        }
    }

    return answer
}