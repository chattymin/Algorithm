import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readLine().split(" ").map { it.toInt() }

    val temp = MutableList<String>(N){""}
    val result = mutableListOf<String>()

    repeat(N){
        temp[it] = readLine()
    }
    temp.sort()

    repeat(M){
        val name = readLine()
        if (isDBJ(name, temp)) result.add(name) // 듣도 못한 사람 리트스에 보도못한사람이 존재한다면 결과 리스트에 추가
    }

    bw.write("${result.size}\n")
    result.sorted().forEach { // 정렬 후 하나씩 엔터 넣어서 출력
        bw.write(it + "\n")
    }
    bw.flush()
    bw.close()
}

fun isDBJ(name: String, temp: MutableList<String>): Boolean{ //DBJ = 듣보잡 ㅋㅋ
    var start = 0
    var end = temp.size - 1

    while (start <= end){
        var mid = (start + end) / 2

        if (temp[mid] < name){
            start = mid + 1
        }else if (temp[mid] > name){
            end = mid - 1
        }else
            return true
    }

    return false
}

/*
1번 아이디어 : -> 시간초과
듣도 못한 명단 입력받은 값을 배열에 저장 후 보도 못한 사람 명단과 비교해서 결과 배열 생성 후 정렬하여 출력

2번 아이디어 : MutableList 를 HashSet으로 변경
 */