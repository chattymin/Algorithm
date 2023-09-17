import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val result = mutableListOf<String>()
    val stack = Stack<Int>()

    var now = 1
    for(i in 0 until n) {
        val cmd = readLine().toInt()

        while(now <= cmd){
            stack.push(now)
            result += "+"
            now++
        }

        if (cmd == stack.last()) {
            stack.pop()
            result += "-"
        } else {
            result.clear()
            result += "NO"
            break
        }
    }

    result.forEach {
        bw.write(it + "\n")
    }
    bw.flush()
    bw.close()
}


/*
스텍에 넣었다가 빼는 값을 저장하는 거였네 허허

되는 규칙을 찾아보고, 안되는 규칙을 찾아보자

연속된 숫자 사이에 뭔가 다른 값이 들어가는게 될까?
ex)
3
5
4
-> 된다. 3넣고 pop, 4넣고, 5넣고 pop pop


낮은숫자가 큰 숫자보다 위
넣자마자 팝 하는 방식으로 가능하다
1 넣고 pop, 2 넣고 pop

큰 숫자가 작은 숫자보다 위
두번 넣고 pop pop 하면 된다.



어떤 숫자를 보고,
그 밑에를 봤을 때 그 숫자보다 낮은 숫자가 점점 올라가는 모양이 가능할까?
6
2
4
...

불가능하다.

큰 값을 보고, 그 다음 값이 연결인지 확인. 제일 큰 값 만큼 +
그리고 그 값을 저장한 후 연결된 값 내려간 만큼 빼줌. 그리고 1 더 뺀 다음 - 출력
그 후 다음 값이 자신보다 커졌다면  지금까지 최댓값과 비교해서 더 큰만큼 +


스택에는 그럼 입력받은 순서 반대로 존재한다는 거잖아

1 2 5 7 8 6 3 4

MAX 나오면 지금까지 - 수를 MAX에 빼고 출력

+ + + + - - + + - + + - - - - -

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val temp = mutableListOf<Int>()
    val result = mutableListOf<Char>()

    repeat(n){
        val num = readLine().toInt()

        temp.add(num)
    }

    var top = 0
    for (i in 0 until temp.size - 2){
        if (temp[i] > top) top = temp[i]

        var first = temp[i + 1]
        var second = temp[i + 2]
        if (first < top && second < top && second > first){
            bw.write("NO")
            bw.flush()
            bw.close()
            return
        }
    }

    temp.reverse()
    var before = 0
    var PlusCount = 0
    var MinusCount = 0

    for (i in 0 until temp.size){
        val it = temp[i]
        if (it == n){
            repeat(n - PlusCount){
                result.add('+')
            }
            repeat(n - MinusCount){
                result.add('-')
            }
            break
        } else if (it < before){
            var plusCnt = before - it
            PlusCount += plusCnt

            repeat(plusCnt){
                result.add('+')
            }
        } else if(it > before){
            var minusCnt = it - before
            MinusCount += minusCnt - 1
            PlusCount += minusCnt

            repeat(minusCnt - 1){
                result.add('+')
            }
            repeat(minusCnt - 1){
                result.add('-')
            }
            result.add('+')
        }
        before = it
    }

    result.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}
------------- 1차시도 였던것-

묘수병 버리고 스택 쓰자.
위에 적어둔 로직을 활용해서 스택으로만 바꿔주자.


젠장 바로 풀리네
 */