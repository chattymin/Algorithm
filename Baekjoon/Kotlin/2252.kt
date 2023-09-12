import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (N, M) = readLine().split(" ").map { it.toInt() }
    val graph = Array(N + 1) { mutableListOf<Int>() }
    val inDegree = IntArray(N + 1)
    val queue: Queue<Int> = LinkedList()
    val result = mutableListOf<Int>()

    repeat(M){
        val (A, B) = readLine().split(" ").map { it.toInt() }

        graph[A].add(B)
        inDegree[B]++
    }

    for (i in 1 .. N){
        if (inDegree[i] == 0) queue.add(i)
    }

    while (queue.isNotEmpty()){
        val now = queue.poll()
        result.add(now)

        for (i in graph[now]){
            inDegree[i]--

            if (inDegree[i] == 0) queue.add(i)
        }
    }

    result.forEach{
        bw.write("$it ")
    }
    bw.flush()
    bw.close()
}

/*
3 2
1 3
2 3

=> 3보다 1이 위다. 3보다 2가 위다
=> 3이 맨 뒤, 1과 2는 랜덤

1-3을 저장해야함
2-3을 저장해야함.



LinkedList?
전체갯수만큼 진입차수를 설정
입력받을 때 마다 진입차수를 조정한다
기본값 0. 뒤에있는 값일 경우, (앞에 있는 애의 진입차수 + 1)과 자기사진의 진입차수 중 비교하여 더 큰 값으로 정렬.
집입차수를 기준으로 sort해주고, 출력.


문제점
4 2
4 1을 한 후
3 4를 하면
4뒤에 있는 1의 순서에 변화가 없어서 1이 4보다 앞에 온다.

-> 자신 뒤에 있는 값들에 대한 변화도 있어야 한다.
=> 자기 뒤에 있는 값들을 list로 가지고 있어야하나?
그러면 한번 할 때 마다 뒤로 밀어야하는데?

list를 만들어서 순서를 기록하고
자기 순서가 된 값을 queue에 넣고 처리하자.
*/