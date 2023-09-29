import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (K, N) = readLine().split(" ").map { it.toInt() }

    var lan = MutableList(K, {0}) // K만큼 배열 할당 후 값 넣기
    repeat(K){
        lan[it] = readLine().toInt()
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(findLen(N,  lan).toString())
    bw.flush()
    bw.close()
}

fun findLen(N: Int, lan: List<Int>): Int{
    // 범위를 Int로 하니까 터져서 Long으로 했슴다
    var start = 1L
    var end = lan.max().toLong()
    var answer = 0L
    // 이분탐색을 사용한 값 구하기
    while (start <= end){
        var mid = (start + end) / 2
        var count = getCount(mid, lan) // for문으로 여기서 구해도 되는데 보기 더러워서 ㅎ...

        if (count >= N){
            answer = mid
            start = mid + 1
        }else {
            end = mid - 1
        }
    }

    return answer.toInt()
}
// kotlin 문법중 하납니다. 간단한건 =(등호)로 연결하면 바로 리턴합니다.
fun getCount(size: Long, lan: List<Int>) = lan.sumOf { it / size }