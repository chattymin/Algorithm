import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val T = readLine().toInt()

    repeat(T){
        val token = StringTokenizer(readLine())

        val R = token.nextToken().toInt()
        val S = token.nextToken()

        var result = ""
        for (i in 0..S.length-1)
            repeat(R){
                result += S[i]
            }

        println(result)
    }
}