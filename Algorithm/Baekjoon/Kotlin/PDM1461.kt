import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.absoluteValue
import kotlin.math.sign

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val library: IntArray = readLine().split(" ").map { it.toInt() }.toIntArray()
    library.sort()

    println(library.toList().toString())

    var result = 0
    val remain = N % M

    var i = 0

    while (i + M <= N){
        var temp = library.slice(i until i+M)

        println(temp.toList().toString())

        if (temp.filter { it.sign == 1 }.count() != 0 && temp.filter { it.sign == -1 }.count() != 0){// 양수 음수 둘다 존재
            // 음수의 갯수만큼 추가 슬라이스 필요. temp.filter { it.sign == -1 }.count() 이 값만큼 추가 슬라이스하고, i를 늘림. 이렇게되면..... 또 for 에런데
            i += temp.filter { it.sign == -1 }.count()

            temp = temp.plus(library.get(i + M - 1))
            println(library.get(i + M -1))
            result += temp.min().absoluteValue * 2
            println("min = ${temp.min().absoluteValue}")
            println("result = $result")
        }

        temp = temp.map {it.absoluteValue }

        result += temp.max() * 2
        println("max = ${temp.max().absoluteValue}")
        println("result = $result")
        i += M
    }

    // 수정 필요
    if (i != N) result += library.last().absoluteValue
    else result -= library.last().absoluteValue


    bw.write("${result}")

    bw.flush()
    bw.close()
}

/*

왼쪽 끝부터 오른쪽 끝까지 이동하면서 묶은 값 만큼 이동해야함.
음수~양수 가 되도록 배열을 정렬
ex)
4 2
1 -2 4 -3 -1


정렬 후 : -3 -2 -1 1 4

내가 한번에 들 수 있는 책의 갯수만큼 0에서부터 값을 이동.

배열에서 내가 한번에 들 수 있는 갯수만큼 묶어서 사용.

-3과 -2가 있을때 둘중 절대값이 더 큰 3만큼 cnt에 더해줌. 그러고, 해당 값만큼 다시 돌아와야 하니까 한번 더 더해줌

그럼 -1이랑 1일땐?
양수랑 음수가 나오는 경우에는 둘다 절대값만큼 두번 더해줘야 함.

어떻게 구분해?
부호를 확인하자 -> .sign
양수 = 1, 음수 = -1
다르면 왼쪽 * 2 + 오른쪽 * 2
같으면 더 큰수 * 2



만약 딱떨어지지 않는 경우는?

총 권수 / 들수있는 책 수 => 이만큼 위의 방식으로 진행

총 권수 % 들수있는 책 수 => 0이 아니면 마지막수 만큼 한번만더함
                    => 0이면 마지막으로 갈때는 돌아올 필요가 없음. -> 마지막 값을 빼면 됨.

홈 => 0을 거칠때는 다시 책을 더 들수 있음!!!

ex)
한번에 3개
-3 -2 1 8
-3,-2를 갈때 책을 3권 들고가서 두권 놔두고, 다시 1로 갈때 두권을 더 들수 있음

다 더한다음에 절댓값이 제일 큰 애를 빼주거나 더해주거나 해야함.


 */