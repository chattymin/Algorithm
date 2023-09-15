import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readLine().split(" ").map { it.toInt() }

    val temp = HashSet<String>() // 시간을 줄이기 위한 HashSet 사용
    val result = mutableListOf<String>() // 정렬 후 출력해야하기 때문에 MutableList 사용

    repeat(N){
        val name = readLine()
        temp.add(name)
    }

    repeat(M){
        val name = readLine()
        if (name in temp) result.add(name) // 듣도 못한 사람 리트스에 보도못한사람이 존재한다면 결과 리스트에 추가
    }

    bw.write("${result.size}\n")
    result.sorted().forEach { // 정렬 후 하나씩 엔터 넣어서 출력
        bw.write(it + "\n")
    }
    bw.flush()
    bw.close()
}

/*
1번 아이디어 : -> 시간초과
듣도 못한 명단 입력받은 값을 배열에 저장 후 보도 못한 사람 명단과 비교해서 결과 배열 생성 후 정렬하여 출력

2번 아이디어 : MutableList 를 HashSet으로 변경
 */