import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val result = MutableList(26){-1}
    val S = readLine()

    for(i:Int in 0..S.length - 1){
        val target = (S[i] - 'a').toInt()
        if (result[target] == -1) result[target] = i
    }

    for (i in result) print(i.toString() + " ")
}