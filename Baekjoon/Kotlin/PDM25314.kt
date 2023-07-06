import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine().toInt()

    for (i in 1..N/4)
        bw.write("long ")
    bw.write("int")

    bw.flush()
    bw.close()
}