package LV.`0`

import kotlin.math.*

fun main() {
    println(solution("1001", "1111"))
}

fun solution(bin1: String, bin2: String): String = decimalToBinary(binaryToDecimal(bin1) + binaryToDecimal(bin2))

// fun solution(bin1: String, bin2: String) = Integer.toBinaryString(bin1.toInt(2) + bin2.toInt(2))
// 로직은 같지만, 함수를 사용한 여부. 이제라도 알았으니까 함수 잘 쓰자...

fun binaryToDecimal(binary: String): Int{
    var result: Int = 0
    var reverse = binary.reversed()
    
    for (i in 0 until  binary.length){
        if (reverse[i] == '1'){
            result += ((2.0).pow(i)).toInt()
        }
    }

    return result
}

fun decimalToBinary(decimal: Int): String{
    var result: String = ""
    var num = decimal

    while (true){
        var temp = num / 2
        var remain = num % 2

        result += remain.toString()

        if (temp == 0) return result.reversed()

        num = temp
    }
}