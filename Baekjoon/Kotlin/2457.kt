import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.time.Duration.Companion.seconds

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val dayList = MutableList<Pair<Int, Int>>(N){Pair(0,0)}

    repeat(N){
        val date = readLine().split(" ").map { it.toInt() }
        dayList[it] = Pair(date[0] * 100 + date[1], date[2] * 100 + date[3])
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(countFlowers(dayList).toString())
    bw.flush()
    bw.close()
}

fun countFlowers(dayList: List<Pair<Int, Int>>): Int{
    var startDay = 301
    val finalEndDay = 1130

    var cnt = 0

    while (startDay <= finalEndDay){
        var temp = dayList.filter { it.first <= startDay }.maxByOrNull { it.second }

        if (temp == null || temp.second <= startDay) return 0

        cnt++
        startDay = temp.second
    }

    return cnt
}


/*

특정 날짜 전에 시작해야하고, 가장 긴 값을 선택.

날짜 클래스를 만들어서 사용
class Date(
    val month: Int,
    val day: Int
)

한 줄 입력을 Pair(Date, Date)로 저장해서 배열처리

이렇게 하니까 sorting 할 때 귀찮다.
month에 100을 곱해서 MMDD로 표기하자.


 */