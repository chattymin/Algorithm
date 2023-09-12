package LV.`1`

import kotlin.math.sqrt

fun main() {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (n in left .. right){
            val set = hashSetOf<Int>()
            
            for (i in 1 .. sqrt(n.toDouble()).toInt()){
                if (n % i == 0) {
                    set.add(i)
                    set.add(n/i)
                }
            }

            when(set.size % 2){
                0 -> answer += n
                1 -> answer -= n
            }
        }

        return answer
    }

    println(solution(13, 17))
}