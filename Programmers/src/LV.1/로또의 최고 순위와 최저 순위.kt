package LV.`1`

fun main() {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        val lottoMap: HashMap<Int, Int> = hashMapOf(
            6 to 1,
            5 to 2,
            4 to 3,
            3 to 4,
            2 to 5,
            1 to 6,
            0 to 6
        )

        val zero = lottos.count { it == 0 }
        var now = 0

        lottos.forEach{ num ->
            if(win_nums.contains(num)) {
                now++
            }
        }

        answer = answer.plus(lottoMap[now + zero] ?: 0 )
        answer = answer.plus(lottoMap[now] ?: 0)

        return answer
    }

    println(solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)))
}