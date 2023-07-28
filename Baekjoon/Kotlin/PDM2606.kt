import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val computerCount = readLine().toInt()
    val times = readLine().toInt()

    var graph = Array(computerCount+1, {BooleanArray(computerCount+1,{false})})

    repeat(times){
        val (fir, sec) = readLine().split(" ").map{it.toInt()}
        graph[fir][sec] = true
        graph[sec][fir] = true
    }

    var starPoint : Queue<Int> = LinkedList()
    starPoint.add(1)

    var visited = BooleanArray(computerCount+1, {false})
    visited[1] = true

    var cnt = 0
    while (starPoint.isNotEmpty()) {
        var num = starPoint.poll()

        for (i in 1..computerCount) {
            if (graph[num][i] && !visited[i]) {
                cnt++
                visited[i] = true
                starPoint.add(i)
            }
        }
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${cnt}")
    bw.flush()
    bw.close()
}