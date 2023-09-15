import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

val ANSWER = mutableListOf<List<Char>>(
    listOf('W','B', 'W', 'B', 'W','B', 'W', 'B'),
    listOf('B', 'W', 'B', 'W','B', 'W', 'B', 'W'),
    listOf('W','B', 'W', 'B', 'W','B', 'W', 'B'),
    listOf('B', 'W', 'B', 'W','B', 'W', 'B', 'W'),
    listOf('W','B', 'W', 'B', 'W','B', 'W', 'B'),
    listOf('B', 'W', 'B', 'W','B', 'W', 'B', 'W'),
    listOf('W','B', 'W', 'B', 'W','B', 'W', 'B'),
    listOf('B', 'W', 'B', 'W','B', 'W', 'B', 'W')
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (M, N) = readLine().split(" ").map { it.toInt() } // M과 N 입력

    val input = mutableListOf<List<Char>>()
    var result = Int.MAX_VALUE

    repeat(M){ // M번 반복
        val line = readLine().map { it.toChar() }

        input.add(line)
    }

    for (i in 0 .. M - 8){
        for (j in 0 .. N - 8){
            // 좌측 상단 시작점을 구해서 함수 사용
            result = min(getCount(i,j,input), result) // 기존 값과 새로 받은 값 중 더 작은 값 선택
        }
    }

    println(result)
}

fun getCount(i: Int, j: Int, input: MutableList<List<Char>>): Int{
    // 좌측상단 시작점을 사용해서 8*8 배열을 만들고, ANSWER과 다른 부분을 check 후 갯수 반환
    var result = 0

    repeat(8){ x->
        repeat(8){ y->
            if (ANSWER[x][y] != input[i+x][j+y]) result++
        }
    }

    return min(result, 64 - result) // B로 시작하는 체스판과 W로 시작하는 체스판중 더 작은 차이의 숫자 반환
}

/*

아이디어 1.
2차원 배열에 때려넣고 8*8로 잘라보면서 확인한다.

확인은 어떻게?
두가지 타입. 첫번째가 W인 경우 / 첫번째가 B인 경우

다른 갯수를 찾는다.

그러면 그냥 답지를 두개 만들어두고 틀린 갯수를 출력시켜볼까

10*10을 어떻게 8*8들로 자를 수 있을까
0,0에서 시작
0,1에서 시작
0,2에서 시작
1,0에서 시작
1,1에서 시작
1,2에서 시작
2,0에서 시작
2,1에서 시작
2,2에서 시작
 */