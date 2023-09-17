import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val T = readLine().toInt()

    repeat(T) {
        val N = readLine().toInt()
        val MBTI = readLine().split(" ")

        var distance = 0
        if (MBTI.size < 33){
            distance = when(MBTI.size){
                1 -> 0
                2 -> calcDistance(MBTI[0], MBTI[1])
                else -> getDistance(MBTI)
            }
        }

        bw.write(distance.toString() + "\n")

    }

    bw.flush()
    bw.close()
}

fun getDistance(MBTI: List<String>): Int {
    val size = MBTI.size
    var min = Int.MAX_VALUE
    for (i in 0 until size - 2) {
        for (j in i + 1 until size - 1) {
            for (k in j + 1 until size) {
                var localMin = calcDistance(MBTI[i], MBTI[j]) + calcDistance(MBTI[j], MBTI[k]) + calcDistance(MBTI[i], MBTI[k])

                if (localMin == 0) return 0
                else if (min > localMin) min = localMin
            }
        }
    }

    return min
}

fun calcDistance(Fir: String, Sec: String): Int {
    var count = 0

    for (i in 0 until 4) {
        if (Fir[i] != Sec[i]) count++
    }

    return count
}


/*
n^3이라 시간초과 무조건 발생
어떻게 해결할까?

0 나오면 그순간 이후에 오는 값이 상관이 없어짐. -> 0나오면 바로 return


알고리즘 분류 보니까 비둘기집 원리가 있음
적용해보면 33개 이상이면 반드시 같은 3개가 존재 -> 무조건 0

 */