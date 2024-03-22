package LV.`1`

fun main() {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var temp = hashSetOf<Int>()
        for(i in 0 until numbers.size - 1 ){
            for (j in i + 1 until numbers.size){
                temp.add(numbers[i] + numbers[j])
            }
        }

        answer += temp.toIntArray().sorted()

        return answer
    }

    println(solution(intArrayOf(2,1,3,4,1)).toList())
}
