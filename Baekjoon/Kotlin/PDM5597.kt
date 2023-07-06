import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr = IntArray(30) {0}

    repeat(28){
        arr[readLine().toInt()-1]++
    }

    repeat(30){
        if (arr[it] == 0)
            println(it+1)
    }
}