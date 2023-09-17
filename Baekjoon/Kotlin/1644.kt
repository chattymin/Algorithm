import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val br = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine().toInt()

    var decimals =  mutableListOf<Int>()

    for (i in 2 .. N){
        if (isPrimeNumber(i)) decimals.add(i)
    }

    br.write(getCnt(N, decimals).toString())
    br.flush()
    br.close()
}

fun isPrimeNumber(targetNumber: Int): Boolean {
    var end = sqrt(targetNumber.toDouble())

    for (i in 2 .. end.toInt()) {
        if (targetNumber % i == 0) {
            return false
        }
    }
    return true
}

fun getCnt(N: Int, decimals: MutableList<Int>): Int{
    var end = 0
    var sum = 0
    var cnt = 0
    val last = decimals.size

    for (start in 0 until last){
        while (sum < N && end < last){
            sum += decimals[end]
            end++
        }

        if (sum == N) cnt++

        sum -= decimals[start]
    }
    return cnt
}


/*
에라토스테네스의 체로 소수리스트 생성

소수 리스트가 나오면 그 리스트를 투포인터를 사용해서 어디서부터 어디까지 합쳐야 하는지 확인

맨 앞에서 시작해서 start변수와 end 변수를 사용해서 투 포인터 구현

 */