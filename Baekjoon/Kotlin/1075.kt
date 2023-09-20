import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var N = readLine().toInt()
    val F = readLine().toInt()

    var temp = N / 100 * 100
    var NTemp = temp / F * F

    if (NTemp < temp){
        bw.write("%02d".format((NTemp + F)%100))
    }else{
        bw.write("%02d".format(NTemp%100))
    }
    bw.flush()
    bw.close()
}