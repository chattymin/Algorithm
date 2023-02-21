import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (M, N) = readLine().split(" ").map { it.toInt() }
    val result = MutableList<Int>(M, {0})

    repeat(N){
        val (i, j, k) = readLine().split(" ").map { it.toInt() }
        changeBall(i, j, k, result)
    }

    repeat(M){
        bw.write("${result[it]} ")
    }



    bw.flush()
    bw.close()
}

fun changeBall(i: Int, j: Int, k: Int, result: MutableList<Int>){
    for (num in i-1..j-1)
        result.set(num, k)
}