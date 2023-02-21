import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val result = MutableList<Int>(N, {it -> it+1})

    repeat(M){
        val (i, j) = readLine().split(" ").map { it.toInt() }
        result.swap(i-1, j-1)
    }

    repeat(N){
        bw.write("${result[it]} ")
    }

    bw.flush()
    bw.close()
}

fun MutableList<Int>.swap(index1 : Int, index2 : Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}