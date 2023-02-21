import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    var input = readLine().toInt() - 1
    var cnt = 1

    while (input > 0){
        input -= 6*cnt
        cnt++
    }
    println(cnt)
}