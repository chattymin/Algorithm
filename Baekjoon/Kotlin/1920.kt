import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val NList = readLine().split(" ").sorted()

    val M = readLine().toInt()
    val MList = readLine().split(" ")

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    MList.forEach {
        bw.write("${isExisted(NList, it)}\n")
    }
    bw.flush()
    bw.close()
}

fun isExisted(NList: List<String>, item: String): Int{
    var start = 0
    var end = NList.size - 1

    while (start <= end){
        var mid = (start + end) / 2

        if (NList[mid] < item)
            start = mid + 1
        else if (NList[mid] > item)
            end = mid - 1
        else
            return 1
    }

    return 0
}
