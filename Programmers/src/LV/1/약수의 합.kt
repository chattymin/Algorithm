package LV.`1`

import kotlin.math.sqrt

fun main() {
    println(solution(12))
}

//fun solution(n: Int): Int = (1 .. n).filter { n % it == 0 }.sum()
fun solution(n: Int): Int{
    var set = hashSetOf<Int>()
    for (i in 1 .. sqrt(n.toDouble()).toInt()){
        if (n % i == 0) {
            set.add(i)
            set.add(n / i)
        }
    }
    return set.sum()
}