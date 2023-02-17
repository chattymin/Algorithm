import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val str = readLine()
    var result = 0

    repeat(str.length){
        when(str[it].toInt() - 64){
            in 1..3 -> result += 3
            in 4..6 -> result += 4
            in 7..9 -> result += 5
            in 10..12 -> result += 6
            in 13..15 -> result += 7
            in 16..19 -> result += 8
            in 20..22 -> result += 9
            else -> result += 10
        }
    }

    println(result)



}