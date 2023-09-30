import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val NList = readLine().split(" ").sorted().toHashSet()

    val M = readLine().toInt()
    val MList = readLine().split(" ")

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    MList.forEach {
        if (NList.contains(it)) bw.write("1\n")
        else bw.write("0\n")
    }
    bw.flush()
    bw.close()
}