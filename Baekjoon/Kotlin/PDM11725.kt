import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine().toInt()
    val graph = Array(N + 1) { LinkedList<Int>() }
    val parent = IntArray(N + 1)
    val visited = BooleanArray(N + 1) { false }

    repeat(N - 1) {
        val (node1, node2) = readLine().split(" ").map { it.toInt() }
        graph[node1].add(node2)
        graph[node2].add(node1)
    }

    visited[1] = true
    dfs(graph, visited, parent, N,1)

    for (i in 2..N)
        bw.write("${parent[i]}\n")

    bw.flush()
    bw.close()
}


fun dfs(graph: Array<LinkedList<Int>>, visited: BooleanArray, parent: IntArray,N: Int, now: Int) {
    graph[now].forEach{
        if (!visited[it]) {
            visited[it] = true
            parent[it] = now
            dfs(graph, visited, parent, N, it)
        }
    }
}

// 전체 정보 기록. 그러고 DFS Or BFS해서 parent찾기