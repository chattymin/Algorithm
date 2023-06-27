package LV.`0`

import java.lang.Math.abs

fun main() {
    println(solution(2, 4, 5, 7))
}

fun solution(a: Int, b: Int, c: Int, d: Int): Int {
    var temp: Set<Int> = setOf(a,b,c,d)
    var arr = arrayOf(a,b,c,d)

    return when(temp.size){
        1 -> 1111 * temp.first()
        2 -> {
            var first = temp.first()
            var last = temp.last()
            if (arr.count{it == first} == 3){
                (10 * first + last) * (10 * first + last)
            }else if(arr.count{it == temp.first()} == 2){
                (first + last) * abs(first - last)
            }else{
                (10 * last + first) * (10 * last + first)
            }
        }
        3 -> {
            var list = temp.toList()
            val first = list[0]
            val seccond = list[1]
            val third = list[2]

            if (arr.count{it == first} == 2) seccond * third
            else if (arr.count{it == seccond} == 2) first * third
            else first * seccond
        }
        else -> temp.sorted().first()
    }
}