import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }

    var start = 0
    var last = N-1

    var result = Triple(0,0, Int.MAX_VALUE)
    while (start != last){
        val fir = arr[start]
        val sec = arr[last]
        val sum = fir + sec

        if (abs(result.third) > abs(sum))
            result = Triple(fir, sec, sum)

        if (sum < 0) start++
        else last--
    }


    bw.write("${result.first} ${result.second}")
    bw.flush()
    bw.close()
}