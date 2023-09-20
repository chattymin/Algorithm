import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var N: Int = readLine().toInt()
    var result = 665

    while (N > 0) {
        result++
        var temp = result

        while (temp > 100) {
            if (temp % 1000 == 666) {
                N--
                break
            }
            temp /= 10
        }
    }

    var bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(result.toString())
    bw.flush()
    bw.close()

    /*
    toString()을 써서 단순히 포함 여부를 확인했더니 개느리네요. 왜죠?
    toString()연산이 무겁나??
    160828KB, 412ms

    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var N = readLine().toInt()
    var result = 666

    while (true){
        if (result.toString().contains("666")){
            N--
            if (N <= 0) break
        }
        result++
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()

     */
}