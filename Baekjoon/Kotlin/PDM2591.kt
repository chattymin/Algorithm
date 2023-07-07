import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/*
var count: Int = 0

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var number = readLine()

    countCard(number)

    bw.write("$count")
    bw.flush()
    bw.close()
}


// 백트래킹 방식
fun countCard(number: String){
    if (number.slice(0 .. 1).toInt() <= 34) {
        if (number.length <= 3) count += 1
        else countCard(number.slice(2 until number.length))
    }

    if (number.length <= 2) count += 1
    else countCard(number.slice(1 until number.length))
}

 */

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var number = readLine()

    val numList = mutableListOf<Int>()
    var count = 1

    // 연속된 숫자 찾기
    for (i in 0 until number.length-1){
        var now = number.slice(i .. i+1).toInt()
        if (now <= 34 && now >= 10) {
            count++
            if (number[i+1] == '0') count -= 2

            if (i == number.length-2) {
                numList.add(count)
            }
        }else{
            numList.add(count)
            count = 1
        }
    }

    // 연속된 숫자에 해당하는 배열 만들기
    val countList = mutableListOf<Int>(1,1,2)
    (3 .. numList.max()).map { countList.add(countList[it - 1] + countList[it - 2]) }


    bw.write("${numList.fold(1){sum, num -> sum*countList[num] }}")
    bw.flush()
    bw.close()
}



/*
ex) 27123

숫자를 입력받음.

백트래킹을 사용함. 앞에서부터 34이하면 묶어버림. 그리고 뒷부분을 다시 묶어버릴지 선택 후 묶기 반복
마지막일때 돌아온다는 것을 파악하는 방법은? : 묶거나, 안묶는다고 판단한 후 뒤에 길이가 1 혹은 0이면 끝

27 12 23

27 : 34보다 작으니까 묶음
12 : 34보다 작으니까 묶음
=> 27 12 3

12를 묶기 전으로 이동하여 1을 따로 뺌
23 : 34보다 작으니까 묶음
=> 27 1 23

23을 묶기 전으로 이동하여 2를 따로 뺌
=> 27 1 2 3

27을 묶기 전으로 이동하여 7을 따로 뺌
71 : 34보다 크니까 안묶음
12 : 34보다 작으니까 묶음
=> 2 7 12 3

12를 묶기 전으로 이동하여 1을 따로 뺌
23 : 34보다 작으니까 묶음
=> 2 7 1 23

23을 묶기 전으로 이동하여 2를 따로 뺌
=> 2 7 1 2 3

==> 총 6개.


------------------------------------ 메모리 초과

하나씩 다 해보는 방법은 아닌것 같다. 규칙을 찾아볼까?


연속된 34이하의 숫자 만들 수 있는 경우들
1개 : 1개
2개 : 2개
3개 : 3개
4개 : 5개
5개 : 8개
6개 : 13개

1과 2는 기본적으로 셋팅해두자.
규칙 : f(n) = f(n-1) + f(n-2), (n>3)

연속된거 3개에, 2개짜리 하나 -> 6개 예상

ex)123912
12 3 9 12
12 3 9 1 2
1 23 9 12
1 23 9 1 2
1 2 3 9 12
1 2 3 9 1 2
=> 6개

가설 검증 완료


연속된 숫자를 판별하는 방법
: 0번Index와 1번 Index를 합쳐서 비교 : 가능하면 bool = true. count += 1
-> bool == true  숫자 1늘려서 1과 2 비교 : 반복
-> bool == false arr에 넣음. count = 0
입력받은 값 끝날때까지 반복

------------------------------------ 틀렸습니다.

0을 고려안했다.

예를들어 220일 경우

2 20
22 0
2 2 0

으로  분리를 시키고 있다.

0을 고려한 알고리즘을 만들어보자.
마지막에 0이 나오면 count - 2

22023
22 20 02 23

2 20 23
2 20 2 3

20 11 30 1
20 1 1 30 1

2103011
2 10 30 11
2 10 30 1 1
 */