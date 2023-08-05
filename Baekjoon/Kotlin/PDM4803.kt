import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var case = 0

    while (true) {
        val (n, m) = readLine().split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break
        case++

        val graph = Array(n + 1) { LinkedList<Int>() }
        val visited = BooleanArray(n + 1)
        var treeCnt = 0

        repeat(m) {
            val (node1, node2) = readLine().split(" ").map { it.toInt() }

            graph[node1].add(node2)
            graph[node2].add(node1)
        }

        for (i in 1 .. n){
            if (!visited[i] && isCycle(graph, visited, i, 0))
                treeCnt++
        }

        bw.write("Case $case: ")
        when(treeCnt){
            0 -> bw.write("No trees.")
            1 -> bw.write("There is one tree.")
            else -> bw.write("A forest of ${treeCnt} trees.")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

fun isCycle(graph: Array<LinkedList<Int>>, visited: BooleanArray, now: Int, before: Int): Boolean{
    if (visited[now])
        return false

    var result = true
    visited[now] = true

    graph[now].forEach{ next->
        if (next != before)
            result = (result && isCycle(graph, visited, next, now))
    }

    return result
}
