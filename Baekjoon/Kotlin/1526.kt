import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var N = readLine().toInt()

    while (N.toString().contains(regex = Regex("[01235689]")))
        N--

    bw.write(N.toString())
    bw.flush()
    bw.close()
}