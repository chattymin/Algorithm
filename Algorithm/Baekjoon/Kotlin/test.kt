import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min


fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    println(backspaceCompare("ad#c", "ab#c"))
    /*
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val cost = readLine().split(" ").map { it.toInt() }.toIntArray()
    val len = cost.size
    //val temp = IntArray(len)
    val aa: Stack<Char>

    aa.pop()

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

     */
}

tailrec fun getMin(first: Int, sec: Int, cost: IntArray, index: Int): Int{
    if (index == cost.size) return min(first, sec)
    return getMin(sec, min(first + cost[index], sec + cost[index]), cost, index+1)
}

fun backspaceCompare(s: String, t: String): Boolean = (getStack(s) == getStack(t))

fun getStack(str: String): Stack<Char>{
    val st: Stack<Char> = Stack()
    for(i in 0 until str.length){
        if(str[i] == '#'){
            if(!st.isEmpty())
                st.pop()
        }else
            st.push(str[i])
    }
    return st
}