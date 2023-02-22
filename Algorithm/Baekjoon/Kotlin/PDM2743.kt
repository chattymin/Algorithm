import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val result = MutableList(N, {it -> it+1})

    repeat(M){
        val (i, j) = readLine().split(" ").map { it.toInt() }
        result.change(i-1,j-1)
    }

    repeat(N){ index ->
        bw.write("${result[index]} ")
    }

    bw.flush()
    bw.close()
}