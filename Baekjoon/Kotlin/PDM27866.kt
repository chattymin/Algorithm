import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val S = readLine()
    val i = readLine().toInt()

    bw.write("${S.get(i-1)}")
    bw.flush()
    bw.close()
}