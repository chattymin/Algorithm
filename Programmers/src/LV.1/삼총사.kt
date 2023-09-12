package LV.`1`

fun main() {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val len = number.size

        for (i in 0 until len - 2){
            for (j in i + 1 until len - 1){
                for (k in j + 1 until len)
                    if (number[i] + number[j] + number[k] == 0)
                        answer++
            }
        }

        return answer
    }

    println(solution(intArrayOf(-2, 3, 0, 2, -5)))
}