import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var cntLTH = 0
var cntHTL = 0

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val (N, M) = readLine().split(" ").map { it.toInt() }

    var graph = Array(N+1, { IntArray(N+1,{0}) })
    repeat(M){
        val (fir, sec) = readLine().split(" ")
        graph[fir.toInt()][sec.toInt()] = 1
        graph[sec.toInt()][fir.toInt()] = 2
    }

    var half = (N+1)/2
    var result = 0
    for (i in 1 .. N.toInt()){
        cntLTH = 0
        cntHTL = 0
        var visitedLowToHigh = BooleanArray(N+1, {false})
        var visitedHighToLow = BooleanArray(N+1, {false})

        dfsLowToHigh(graph, visitedLowToHigh, i)
        dfsHighToLow(graph, visitedHighToLow, i)

        if (cntHTL >= half || cntLTH >= half)
            result++
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${result}")
    bw.flush()
    bw.close()
}

fun dfsLowToHigh(graph: Array<IntArray>, visited: BooleanArray, positon: Int){
    visited[positon] = true

    for (i in 0 until graph[positon].size){
        if (!visited[i] && graph[positon][i] == 1){
            cntLTH++
            dfsLowToHigh(graph, visited, i)
        }
    }

}

fun dfsHighToLow(graph: Array<IntArray>, visited: BooleanArray, positon: Int){
    visited[positon] = true
    for (i in 0 until graph[positon].size){
        if (!visited[i] && graph[positon][i] == 2){
            cntHTL++
            dfsHighToLow(graph, visited, i)
        }
    }
}



/*

1 < 2 < 4
3 < 4
1 < 5
=> 자신보다 크거나, 작은게 전체 갯수의 절반 이상이면 cnt++


1,2 => true
2,4 => true
3,4 -=> true


arr을 만듬 (m+1 크기)


밑이면 1
위이면 2
ex) 2,3
arr[2][3] = 1
arr[3][2] = 2

DFS로 이동해서 정방향, 역방향 계산

 */