import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min


fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val cost = readLine().split(" ").map { it.toInt() }.toIntArray()
    val len = cost.size
    //val temp = IntArray(len)

    var first = cost[0]
    var sec  = cost[1]
    var temp = 0

    for (i in 2 until len){
        temp = min(first + cost[i], sec + cost[i])
        first = sec
        sec = temp
    }

    bw.write("${min(first, sec)}")



    //bw.write("${getMin(first,sec,nums,2)}")



    /*
    temp[0] = nums[0]
    temp[1] = nums[1]

    for (i in 2 until len){
        temp[i] = min(temp[i-1] + nums[i], temp[i - 2] + nums[i])
    }

     */

    //bw.write("${min(temp[len-1], temp[len-2])}")

    bw.flush()
    bw.close()
}

tailrec fun getMin(first: Int, sec: Int, cost: IntArray, index: Int): Int{
    if (index == cost.size) return min(first, sec)
    return getMin(sec, min(first + cost[index], sec + cost[index]), cost, index+1)
}