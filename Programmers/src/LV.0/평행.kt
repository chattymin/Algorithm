package LV.`0`

import java.lang.Math.abs

fun main() {
    println(solution2(arrayOf(intArrayOf(1,4), intArrayOf(1,4), intArrayOf(3,4), intArrayOf(11,6))))
}

fun solution2(dots: Array<IntArray>): Int {
    val result: HashSet<Double> = hashSetOf()
    val fir = abs(dots[0].first().toDouble() - dots[1].first()) /  abs(dots[0].last().toDouble() - dots[1].last())
    val fir2 = abs(dots[2].first().toDouble() - dots[3].first()) /  abs(dots[2].last().toDouble() - dots[3].last())
    val sec = abs(dots[0].first().toDouble() - dots[2].first()) /  abs(dots[0].last().toDouble() - dots[2].last())
    val sec2 = abs(dots[2].first().toDouble() - dots[3].first()) /  abs(dots[1].last().toDouble() - dots[3].last())
    val thi = abs(dots[0].first().toDouble() - dots[3].first()) /  abs(dots[0].last().toDouble() - dots[3].last())
    val thi2 = abs(dots[1].first().toDouble() - dots[2].first()) /  abs(dots[1].last().toDouble() - dots[2].last())

    if (fir == fir2) return 1
    if (sec == sec2) return 1
    if (thi == thi2) return 1

    return 0
}


/*
평행의 기준

가로 2 세로 2
이거랑 평행하려면? 가로 세로 비율이 1:1

가로 세로 비율을 구하면 된다!!!!!!!!

ex) 1,4와 3,8 / 9,2와 11,6
1,4와 3,8
가로길이 2
세로길이 4

9,2와 11,6
가로길이 2
세로길이 4

값을 double형으로 바꾸고 x/y를 구해서 비교
 */