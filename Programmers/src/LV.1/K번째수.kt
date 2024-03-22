package LV.`1`

fun main() {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        commands.forEach  {
            var temp = array.slice(it[0] - 1 until it[1])

            temp = temp.sorted()
            println(temp)

            answer += temp[it[2] - 1]
        }

        return answer
    }

    println(solution(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3),intArrayOf(4, 4, 1),intArrayOf(1, 7, 3))).toList())
}
