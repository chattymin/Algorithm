package LV.`1`

import kotlin.math.pow

fun main() {
    fun tenToThree(num: Int): String{
        // 3으로 나누고, 나머지를 배열에 저장하고 reverse하면 됨.
        var temp = num
        var result = mutableListOf<Int>()

        while (temp != 0){
            result.add(temp % 3)
            temp /= 3
        }

        return result.reversed().joinToString("")
    }

    fun threeToTen(num: String): Int{
        // 자릿수를 활용해서 3^0을 곱하고, 3^1을 곱하고 ... 반복
        var temp: Double = 0.0
        var len = num.length
        for (i in 0 until len){
            temp += num[len - i - 1].digitToInt() * 3.0.pow(i)
        }

        return temp.toInt()
    }

    fun solution(n: Int): Int = threeToTen(tenToThree(n).reversed())

    println(solution(45))
}
