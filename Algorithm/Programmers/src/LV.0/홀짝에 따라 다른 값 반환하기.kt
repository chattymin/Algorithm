package LV.`0`

import kotlin.math.pow

fun main() {
    println(solution6(7))
}

fun solution6(n: Int): Int = (2 - (n % 2) .. n step 2).sumOf { (it.toFloat()).pow(2 - (n % 2)).toInt() }

/*
fun solution6(n: Int): Int {
    var answer: Int = 0

    if (n % 2 == 0){
        for (i in 2 .. n step 2)
            answer += (i.toFloat()).pow(2).toInt()
    }else{
        for (i in 1 .. n step 2)
            answer += i
    }

    return answer
}
 */