import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (N, M) = readLine().split(" ").map { it.toLong() }
    val trees = readLine().split(" ").map { it.toLong() }

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${calcMaxHeight(M, trees)}")
    bw.flush()
    bw.close()
}

fun calcMaxHeight(M: Long, trees: List<Long>): Long{
    var start = 0L
    var end = trees.max()
    var mid = (start + end) / 2

    while (start <= end){
        var temp = 0L

        trees.forEach {
            if (it > mid) temp += it - mid
        }

        if (temp == M) break

        if (temp > M) start = mid + 1
        else end = mid - 1

        mid = (start + end) / 2
    }

    return mid
}
