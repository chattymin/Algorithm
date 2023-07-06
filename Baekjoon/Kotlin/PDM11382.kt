import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (A, B, C) = readLine().split(" ").map { it.toBigInteger() }

    bw.write("${A + B + C}")

    bw.flush()
    bw.close()
}