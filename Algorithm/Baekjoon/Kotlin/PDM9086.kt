import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val T = readLine().toInt()

    repeat(T){
        val text = readLine()
        bw.write("${text[0]}${text[text.length-1]}\n")
    }


    bw.flush()
    bw.close()
}