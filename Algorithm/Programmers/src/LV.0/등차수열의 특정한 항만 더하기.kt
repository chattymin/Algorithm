package LV.`0`

fun main() {
    println(solution(3,4, booleanArrayOf(true, false, false, true, true)))
}

fun solution(a: Int, d: Int, included: BooleanArray): Int = (0 until included.size).sumOf { if (included[it]) a + d * it else 0 }
/*
{
    var answer: Int = 0

    for (i in 0 until included.size){

    }

    return answer
}

 */